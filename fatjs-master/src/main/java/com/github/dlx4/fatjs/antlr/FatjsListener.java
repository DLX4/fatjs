package com.github.dlx4.fatjs.antlr;// Generated from Fatjs.g4 by ANTLR 4.7.2



import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FatjsParser}.
 */
public interface FatjsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FatjsParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(FatjsParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(FatjsParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(FatjsParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(FatjsParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(FatjsParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(FatjsParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(FatjsParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(FatjsParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(FatjsParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(FatjsParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(FatjsParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(FatjsParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(FatjsParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(FatjsParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(FatjsParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(FatjsParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(FatjsParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(FatjsParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(FatjsParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(FatjsParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(FatjsParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(FatjsParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(FatjsParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(FatjsParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(FatjsParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(FatjsParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(FatjsParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(FatjsParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(FatjsParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(FatjsParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(FatjsParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(FatjsParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(FatjsParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(FatjsParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(FatjsParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(FatjsParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(FatjsParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(FatjsParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(FatjsParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(FatjsParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(FatjsParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(FatjsParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(FatjsParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(FatjsParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(FatjsParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(FatjsParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(FatjsParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(FatjsParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(FatjsParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(FatjsParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(FatjsParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(FatjsParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(FatjsParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(FatjsParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(FatjsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(FatjsParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(FatjsParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(FatjsParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(FatjsParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(FatjsParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FatjsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FatjsParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(FatjsParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(FatjsParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(FatjsParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(FatjsParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(FatjsParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(FatjsParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(FatjsParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(FatjsParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(FatjsParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(FatjsParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(FatjsParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(FatjsParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(FatjsParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(FatjsParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(FatjsParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(FatjsParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FatjsParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FatjsParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(FatjsParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(FatjsParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(FatjsParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(FatjsParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(FatjsParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(FatjsParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(FatjsParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(FatjsParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(FatjsParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(FatjsParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(FatjsParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(FatjsParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(FatjsParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(FatjsParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(FatjsParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(FatjsParser.ArgumentsContext ctx);
}