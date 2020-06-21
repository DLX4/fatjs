package com.github.dlx4.fatjs.antlr;// Generated from Fatjs.g4 by ANTLR 4.7.2



import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FatjsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FatjsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FatjsParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(FatjsParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(FatjsParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(FatjsParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(FatjsParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(FatjsParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(FatjsParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(FatjsParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(FatjsParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(FatjsParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(FatjsParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(FatjsParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(FatjsParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(FatjsParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(FatjsParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(FatjsParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(FatjsParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(FatjsParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(FatjsParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(FatjsParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(FatjsParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(FatjsParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(FatjsParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(FatjsParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(FatjsParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(FatjsParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(FatjsParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(FatjsParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(FatjsParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(FatjsParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(FatjsParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FatjsParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(FatjsParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(FatjsParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(FatjsParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(FatjsParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(FatjsParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(FatjsParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(FatjsParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(FatjsParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FatjsParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(FatjsParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(FatjsParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(FatjsParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(FatjsParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(FatjsParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(FatjsParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(FatjsParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(FatjsParser.ArgumentsContext ctx);
}