// Generated from Fatjs.g4 by ANTLR 4.7.2



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
	 * Visit a parse tree produced by {@link FatjsParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(FatjsParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(FatjsParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FatjsParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(FatjsParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(FatjsParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(FatjsParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FatjsParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(FatjsParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(FatjsParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(FatjsParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(FatjsParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(FatjsParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(FatjsParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(FatjsParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(FatjsParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FatjsParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(FatjsParser.BlockItemContext ctx);
}