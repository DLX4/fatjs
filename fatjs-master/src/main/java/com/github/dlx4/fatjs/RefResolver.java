package com.github.dlx4.fatjs;

import com.github.dlx4.fatjs.antlr.FatjsBaseListener;
import com.github.dlx4.fatjs.antlr.FatjsParser;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.LinkedList;
import java.util.List;

/**
 * 语义解析的第三步：引用消解和类型推断
 * 1.解析所有的本地变量引用、函数调用和类成员引用。
 * 2.类型推断：从下而上推断表达式的类型。
 * 这两件事要放在一起做，因为：
 * (1)对于变量，只有做了消解，才能推断出类型来。
 * (2)对于FunctionCall，只有把参数（表达式)的类型都推断出来，才能匹配到正确的函数（方法)。
 * (3)表达式里包含FunctionCall,所以要推导表达式的类型，必须知道是哪个Function，从而才能得到返回值。
 *
 */
public class RefResolver extends FatjsBaseListener {

    private AnnotatedTree at = null;

    //用于把本地变量添加到符号表，并计算类型
    ParseTreeWalker typeResolverWalker = new ParseTreeWalker();
    TypeResolver localVariableEnter = null;

    //this()和super()构造函数留到最后去消解，因为它可能引用别的构造函数，必须等这些构造函数都消解完。
    private List<FatjsParser.FunctionCallContext> thisConstructorList = new LinkedList<>();
    private List<FatjsParser.FunctionCallContext> superConstructorList = new LinkedList<>();

    public RefResolver(AnnotatedTree at) {
        this.at = at;
        localVariableEnter = new TypeResolver(at, true);
    }

    //把本地变量加到符号表。本地变量必须是边添加，边解析，不能先添加后解析，否则会引起引用消解的错误。
    //Aaaaaaaaaaayou同学请看这里。
    @Override
    public void enterVariableDeclarators(FatjsParser.VariableDeclaratorsContext ctx) {
        Scope scope = at.enclosingScopeOfNode(ctx);
        if (scope instanceof BlockScope){
            typeResolverWalker.walk(localVariableEnter, ctx);
        }
    }

    @Override
    public void exitPrimary(FatjsParser.PrimaryContext ctx) {
        Scope scope = at.enclosingScopeOfNode(ctx);
        Type type = null;

        //标识符
        if (ctx.IDENTIFIER() != null) {
            String idName = ctx.IDENTIFIER().getText();

            Variable variable = at.lookupVariable(scope, idName);
            if (variable == null) {
                // 看看是不是函数，因为函数可以作为值来传递。这个时候，函数重名没法区分。
                // 因为普通Scope中的函数是不可以重名的，所以这应该是没有问题的。  //TODO 但如果允许重名，那就不行了。
                // TODO 注意，查找function的时候，可能会把类的方法包含进去
                Function function = at.lookupFunction(scope, idName);
                if (function != null) {
                    at.symbolOfNode.put(ctx, function);
                    type = function;
                } else {
                    at.log("unknown variable or function: " + idName, ctx);
                }

            } else {
                at.symbolOfNode.put(ctx, variable);

                type = variable.type;
            }
        }
        //字面量
        else if (ctx.literal() != null) {
            type = at.typeOfNode.get(ctx.literal());
        }
        //括号里的表达式
        else if (ctx.expression() != null) {
            type = at.typeOfNode.get(ctx.expression());
        }
        //this关键字
        else if (ctx.THIS() != null){
            //找到Class类型的上级Scope
            Class theClass = at.enclosingClassOfNode(ctx);
            if (theClass != null){
                This variable = theClass.getThis();
                at.symbolOfNode.put(ctx, variable);

                type = theClass;
            }
            else{
                at.log("keyword \"this\" can only be used inside a class", ctx);
            }
        }
        //super关键字。看上去跟This关键字的用法完全一样？
        else if (ctx.SUPER() != null){
            //找到Class类型的上级Scope
            Class theClass = at.enclosingClassOfNode(ctx);
            if (theClass != null){
                Super variable = theClass.getSuper();
                at.symbolOfNode.put(ctx, variable);

                type = theClass;
            }
            else{
                at.log("keyword \"super\" can only be used inside a class", ctx);
            }
        }

        //类型推断、冒泡
        at.typeOfNode.put(ctx,type);
    }


    @Override
    public void exitFunctionCall(FatjsParser.FunctionCallContext ctx) {

        // this
        if(ctx.THIS() != null){
            thisConstructorList.add(ctx);
            return;
        }
        // super
        else if(ctx.SUPER() != null){
            superConstructorList.add(ctx);
            return;
        }

        //TODO 临时代码，支持println
        if(ctx.IDENTIFIER().getText().equals("println")){
            return;
        }

        String idName = ctx.IDENTIFIER().getText();

        // 获得参数类型，这些类型已经在表达式中推断出来
        List<Type> paramTypes = getParamTypes(ctx);

        boolean found = false;

        // 看看是不是点符号表达式调用的，调用的是类的方法
        if (ctx.parent instanceof FatjsParser.ExpressionContext) {
            FatjsParser.ExpressionContext exp = (FatjsParser.ExpressionContext) ctx.parent;
            if (exp.bop != null && exp.bop.getType() == FatjsParser.DOT) {
                Symbol symbol = at.symbolOfNode.get(exp.expression(0));
                if (symbol instanceof Variable && ((Variable) symbol).type instanceof Class) {
                    Class theClass = (Class) ((Variable) symbol).type;

                    //查找名称和参数类型都匹配的函数。不允许名称和参数都相同，但返回值不同的情况。
                    Function function = theClass.getFunction(idName, paramTypes);
                    if (function != null) {
                        found = true;
                        at.symbolOfNode.put(ctx, function);
                        at.typeOfNode.put(ctx, function.getReturnType());
                    }
                    else {
                        Variable funcVar = theClass.getFunctionVariable(idName,paramTypes);
                        if (funcVar != null){
                            found = true;
                            at.symbolOfNode.put(ctx, funcVar);
                            at.typeOfNode.put(ctx, ((FunctionType)funcVar.type).getReturnType());
                        }
                        else {
                            at.log("unable to find method " + idName + " in Class " + theClass.name, exp);
                        }
                    }

                } else {
                    at.log("unable to resolve a class", ctx);
                }
            }
        }

        Scope scope = at.enclosingScopeOfNode(ctx);

        //从当前Scope逐级查找函数(或方法)
        if (!found) {
            Function function = at.lookupFunction(scope, idName, paramTypes);
            if (function != null){
                found = true;
                at.symbolOfNode.put(ctx, function);
                at.typeOfNode.put(ctx, function.returnType);
            }
        }

        if (!found) {
            // 看看是不是类的构建函数，用相同的名称查找一个class
            Class theClass = at.lookupClass(scope, idName);
            if (theClass != null) {
                Function function = theClass.findConstructor(paramTypes);
                if (function != null) {
                    found = true;
                    at.symbolOfNode.put(ctx, function);
                }
                //如果是与类名相同的方法，并且没有参数，那么就是缺省构造方法
                else if (ctx.expressionList() == null){
                    found = true;
                    //at.symbolOfNode.put(ctx, theClass); // TODO 直接赋予class
                    at.symbolOfNode.put(ctx, theClass.defaultConstructor());
                }
                else{
                    at.log("unknown class constructor: " + ctx.getText(), ctx);
                }

                at.typeOfNode.put(ctx, theClass); // 这次函数调用是返回一个对象
            }

            //看看是不是一个函数型的变量
            else{
                Variable variable = at.lookupFunctionVariable(scope,idName, paramTypes);
                if (variable != null && variable.type instanceof FunctionType){
                    found = true;
                    at.symbolOfNode.put(ctx, variable);
                    at.typeOfNode.put(ctx, variable.type);
                }
                else {
                    at.log("unknown function or function variable: " + ctx.getText(), ctx);
                }
            }

        }

    }

    /**
     * 消解this()构造函数
     * @param ctx
     */
    private void resolveThisConstructorCall(FatjsParser.FunctionCallContext ctx){
        Class theClass = at.enclosingClassOfNode(ctx);
        if (theClass != null){
            Function function = at.enclosingFunctionOfNode(ctx);
            if (function != null && function.isConstructor()){
                //检查是不是构造函数中的第一句
                FatjsParser.FunctionDeclarationContext fdx = (FatjsParser.FunctionDeclarationContext) function.ctx;
                if (!firstStatmentInFunction(fdx, ctx)){
                    at.log("this() must be first statement in a constructor", ctx);
                    return;
                }

                List<Type> paramTypes = getParamTypes(ctx);
                Function refered = theClass.findConstructor(paramTypes);
                if (refered != null){
                    at.symbolOfNode.put(ctx,refered);
                    at.typeOfNode.put(ctx,theClass);
                    at.thisConstructorRef.put(function, refered);
                }
                else if (paramTypes.size() == 0){  //缺省构造函数
                    at.symbolOfNode.put(ctx,theClass.defaultConstructor());
                    at.typeOfNode.put(ctx,theClass);
                    at.thisConstructorRef.put(function, theClass.defaultConstructor());
                }
                else{
                    at.log("can not find a constructor matches this()", ctx);
                }
            }
            else{
                at.log("this() should only be called inside a class constructor", ctx);
            }
        }
        else{
            at.log("this() should only be called inside a class", ctx);
        }
    }

    private boolean firstStatmentInFunction(FatjsParser.FunctionDeclarationContext fdx, FatjsParser.FunctionCallContext ctx){
        if (fdx.functionBody().block().blockStatements().blockStatement(0).statement()!= null
            && fdx.functionBody().block().blockStatements().blockStatement(0).statement().expression()!= null
            && fdx.functionBody().block().blockStatements().blockStatement(0).statement().expression().functionCall()==ctx){
            return true;
        }

        return false;
    }

    /**
     * 消解Super()构造函数
     * TODO 对于调用super()是有要求的，比如：
     * (1)必须出现在构造函数的第一行，
     * (2)this()和super不能同时出现，等等。
     * @param ctx
     */
    private void resolveSuperConstructorCall(FatjsParser.FunctionCallContext ctx){
        Class theClass = at.enclosingClassOfNode(ctx);
        if (theClass != null){
            Function function = at.enclosingFunctionOfNode(ctx);
            if (function != null && function.isConstructor()){
                Class parentClass = theClass.getParentClass();
                if (parentClass != null){
                    //检查是不是构造函数中的第一句
                    FatjsParser.FunctionDeclarationContext fdx = (FatjsParser.FunctionDeclarationContext) function.ctx;
                    if (!firstStatmentInFunction(fdx, ctx)){
                        at.log("super() must be first statement in a constructor", ctx);
                        return;
                    }

                    List<Type> paramTypes = getParamTypes(ctx);
                    Function refered = parentClass.findConstructor(paramTypes);
                    if (refered != null){
                        at.symbolOfNode.put(ctx,refered);
                        at.typeOfNode.put(ctx,theClass);
                        at.superConstructorRef.put(function, refered);

                    }
                    else if(paramTypes.size() == 0) {  //缺省构造函数
                        at.symbolOfNode.put(ctx, parentClass.defaultConstructor());
                        at.typeOfNode.put(ctx,theClass);
                        at.superConstructorRef.put(function, theClass.defaultConstructor());
                    }
                    else{
                        at.log("can not find a constructor matches this()", ctx);
                    }
                }
                else{  //父类是最顶层的基类。
                    //TODO 这里暂时不处理
                }
            }
            else{
                at.log("super() should only be called inside a class constructor", ctx);
            }
        }
        else{
            at.log("super() should only be called inside a class", ctx);
        }
    }

    /**
     * 获得函数的参数列表
     * @param ctx
     * @return
     */
    private List<Type> getParamTypes(FatjsParser.FunctionCallContext ctx){
        List<Type> paramTypes = new LinkedList<Type>();
        if (ctx.expressionList() != null) {
            for (FatjsParser.ExpressionContext exp : ctx.expressionList().expression()) {
                Type type = at.typeOfNode.get(exp);
                paramTypes.add(type);
            }
        }
        return paramTypes;
    }

    //消解处理点符号表达式的层层引用
    @Override
    public void exitExpression(FatjsParser.ExpressionContext ctx) {
        Type type = null;

        if (ctx.bop != null && ctx.bop.getType() == FatjsParser.DOT) {
            // 这是个左递归，要不断的把左边的节点的计算结果存到node2Symbol，所以要在exitExpression里操作
            Symbol symbol = at.symbolOfNode.get(ctx.expression(0));
            if (symbol instanceof Variable && ((Variable) symbol).type instanceof Class) {
                Class theClass = (Class) ((Variable) symbol).type;

                //引用类的属性
                if (ctx.IDENTIFIER() != null) {
                    String idName = ctx.IDENTIFIER().getText();
                    Variable variable = at.lookupVariable(theClass, idName); // 在类的scope里去查找，不需要改变当前的scope
                    if (variable != null) {
                        at.symbolOfNode.put(ctx, variable);
                        type = variable.type;  //类型综合（冒泡)
                    } else {
                        at.log("unable to find field " + idName + " in Class " + theClass.name, ctx);
                    }
                }

                //引用类的方法
                else if (ctx.functionCall() != null){
                    type = at.typeOfNode.get(ctx.functionCall());
                }

            } else {
                at.log("symbol is not a qualified object：" + symbol, ctx);
            }
        }

        //变量引用冒泡： 如果下级是一个变量，往上冒泡传递，以便在点符号表达式中使用
        //也包括This和Super的冒泡
        else if (ctx.primary() != null) {
            Symbol symbol = at.symbolOfNode.get(ctx.primary());
            at.symbolOfNode.put(ctx, symbol);
        }


        //类型推断和综合
        if (ctx.primary() != null) {
            type = at.typeOfNode.get(ctx.primary());
        } else if (ctx.functionCall() != null) {
            type = at.typeOfNode.get(ctx.functionCall());
        } else if (ctx.bop != null && ctx.expression().size() >= 2) {
            Type type1 = at.typeOfNode.get(ctx.expression(0));
            Type type2 = at.typeOfNode.get(ctx.expression(1));

            switch (ctx.bop.getType()) {
                case FatjsParser.ADD:
                    if (type1 == PrimitiveType.String || type2 == PrimitiveType.String){
                        type = PrimitiveType.String;
                    }
                    else if (type1 instanceof PrimitiveType && type2 instanceof PrimitiveType){
                        //类型“向上”对齐，比如一个int和一个float，取float
                        type = PrimitiveType.getUpperType(type1,type2);
                    }else{
                        at.log("operand should be PrimitiveType for additive and multiplicative operation", ctx);
                    }
                    break;
                case FatjsParser.SUB:
                case FatjsParser.MUL:
                case FatjsParser.DIV:
                    if (type1 instanceof PrimitiveType && type2 instanceof PrimitiveType){
                        //类型“向上”对齐，比如一个int和一个float，取float
                        type = PrimitiveType.getUpperType(type1,type2);
                    }else{
                        at.log("operand should be PrimitiveType for additive and multiplicative operation", ctx);
                    }

                    break;
                case FatjsParser.EQUAL:
                case FatjsParser.NOTEQUAL:
                case FatjsParser.LE:
                case FatjsParser.LT:
                case FatjsParser.GE:
                case FatjsParser.GT:
                case FatjsParser.AND:
                case FatjsParser.OR:
                case FatjsParser.BANG:
                    type = PrimitiveType.Boolean;
                    break;
                case FatjsParser.ASSIGN:
                case FatjsParser.ADD_ASSIGN:
                case FatjsParser.SUB_ASSIGN:
                case FatjsParser.MUL_ASSIGN:
                case FatjsParser.DIV_ASSIGN:
                case FatjsParser.AND_ASSIGN:
                case FatjsParser.OR_ASSIGN:
                case FatjsParser.XOR_ASSIGN:
                case FatjsParser.MOD_ASSIGN:
                case FatjsParser.LSHIFT_ASSIGN:
                case FatjsParser.RSHIFT_ASSIGN:
                case FatjsParser.URSHIFT_ASSIGN:
                    type = type1;
                    break;
            }
        }

        //类型冒泡
        at.typeOfNode.put(ctx, type);

    }


    //对变量初始化部分也做一下类型推断
    @Override
    public void exitVariableInitializer(FatjsParser.VariableInitializerContext ctx) {
        if (ctx.expression() != null){
            at.typeOfNode.put(ctx, at.typeOfNode.get(ctx.expression()));
        }
    }

    //根据字面量来推断类型
    @Override
    public void exitLiteral(FatjsParser.LiteralContext ctx) {
        if (ctx.BOOL_LITERAL() != null) {
            at.typeOfNode.put(ctx, PrimitiveType.Boolean);
        } else if (ctx.CHAR_LITERAL() != null) {
            at.typeOfNode.put(ctx, PrimitiveType.Char);
        } else if (ctx.NULL_LITERAL() != null) {
            at.typeOfNode.put(ctx, PrimitiveType.Null);
        } else if (ctx.STRING_LITERAL() != null) {
            at.typeOfNode.put(ctx, PrimitiveType.String);
        } else if (ctx.integerLiteral() != null) {
            at.typeOfNode.put(ctx, PrimitiveType.Integer);
        } else if (ctx.floatLiteral() != null) {
            at.typeOfNode.put(ctx, PrimitiveType.Float);
        }

    }

    /**
     * 在结束扫描之前，把this()和super()构造函数消解掉
     * @param ctx
     */
    @Override
    public void exitProg(FatjsParser.ProgContext ctx) {
        for (FatjsParser.FunctionCallContext fcc : thisConstructorList){
            resolveThisConstructorCall(fcc);
        }

        for (FatjsParser.FunctionCallContext fcc : superConstructorList){
            resolveSuperConstructorCall(fcc);
        }
    }


}