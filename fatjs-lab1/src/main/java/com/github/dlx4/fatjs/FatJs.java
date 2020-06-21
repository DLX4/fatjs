package com.github.dlx4.fatjs;

import com.github.dlx4.fatjs.antlr.FatjsParser;
import com.github.dlx4.fatjs.antlr.FatjsLexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * 用Antlr对02~05讲的功能进行了重构，重新实现了词法分析器和语法分析器，并做了一下验证。
 * 这里没有实现太多功能，只有整数的加减乘除而已。
 */
public class FatJs {

    public static void main(String args[]) {
        //String script = "2+6/3";
        String script = "2+6*3";

        //词法分析
        FatjsLexer lexer = new FatjsLexer(CharStreams.fromString(script));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //语法分析
        FatjsParser parser = new FatjsParser(tokens);
        ParseTree tree = parser.additiveExpression();

        //打印语法树
        System.out.println("The lisp style ast of : " + script);
        System.out.println(tree.toStringTree(parser));

        //解释执行
        ASTEvaluator visitor = new ASTEvaluator();
        Integer result = visitor.visit(tree);
        System.out.println("\nValue of : " + script);
        System.out.println(result);
    }
}
