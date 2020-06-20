// Generated from fatjs.g4 by ANTLR 4.7.2



import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fatjsParser}.
 */
public interface fatjsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fatjsParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(fatjsParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link fatjsParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(fatjsParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link fatjsParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(fatjsParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fatjsParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(fatjsParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fatjsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(fatjsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fatjsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(fatjsParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fatjsParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(fatjsParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fatjsParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(fatjsParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fatjsParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(fatjsParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link fatjsParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(fatjsParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link fatjsParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(fatjsParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link fatjsParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(fatjsParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link fatjsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(fatjsParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fatjsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(fatjsParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fatjsParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(fatjsParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fatjsParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(fatjsParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fatjsParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(fatjsParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link fatjsParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(fatjsParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link fatjsParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(fatjsParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fatjsParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(fatjsParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fatjsParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(fatjsParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fatjsParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(fatjsParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fatjsParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(fatjsParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fatjsParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(fatjsParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fatjsParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(fatjsParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fatjsParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(fatjsParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link fatjsParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(fatjsParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fatjsParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(fatjsParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fatjsParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(fatjsParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fatjsParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(fatjsParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link fatjsParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(fatjsParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link fatjsParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(fatjsParser.BlockItemContext ctx);
}