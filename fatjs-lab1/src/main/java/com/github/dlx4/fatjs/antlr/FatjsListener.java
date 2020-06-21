package com.github.dlx4.fatjs.antlr;// Generated from Fatjs.g4 by ANTLR 4.7.2



import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FatjsParser}.
 */
public interface FatjsListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link FatjsParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(FatjsParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(FatjsParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(FatjsParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(FatjsParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(FatjsParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(FatjsParser.InitializerContext ctx);
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
	 * Enter a parse tree produced by {@link FatjsParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(FatjsParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(FatjsParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(FatjsParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(FatjsParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(FatjsParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(FatjsParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(FatjsParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(FatjsParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(FatjsParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(FatjsParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(FatjsParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(FatjsParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(FatjsParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(FatjsParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(FatjsParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(FatjsParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FatjsParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(FatjsParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link FatjsParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(FatjsParser.BlockItemContext ctx);
}