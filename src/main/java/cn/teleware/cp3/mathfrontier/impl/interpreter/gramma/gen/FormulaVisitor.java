// Generated from E:/workspace_java/mathfrontier-j/document\Formula.g4 by ANTLR 4.7

package cn.teleware.cp3.mathfrontier.impl.interpreter.gramma.gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FormulaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FormulaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FormulaParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(FormulaParser.FormulaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumeralValue}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeralValue(FormulaParser.NumeralValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionDiv}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionDiv(FormulaParser.ExpressionDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionWhen}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionWhen(FormulaParser.ExpressionWhenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(FormulaParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionMult}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMult(FormulaParser.ExpressionMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionMinus}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMinus(FormulaParser.ExpressionMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodInvok}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvok(FormulaParser.MethodInvokContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketsExpression}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketsExpression(FormulaParser.BracketsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionPlus}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionPlus(FormulaParser.ExpressionPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#whenExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenExpression(FormulaParser.WhenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#whenBranches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenBranches(FormulaParser.WhenBranchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#whenBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenBranch(FormulaParser.WhenBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#whenCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenCondition(FormulaParser.WhenConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#logicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpression(FormulaParser.LogicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#leftOmittedLogicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftOmittedLogicExpression(FormulaParser.LeftOmittedLogicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#elseBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBranch(FormulaParser.ElseBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#logicSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicSymbol(FormulaParser.LogicSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#cmpSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpSymbol(FormulaParser.CmpSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(FormulaParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(FormulaParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#methodParameterPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParameterPart(FormulaParser.MethodParameterPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#methodParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParameterList(FormulaParser.MethodParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#methodParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParameter(FormulaParser.MethodParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(FormulaParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#variableReferenceStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReferenceStart(FormulaParser.VariableReferenceStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#variableReferenceEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReferenceEnd(FormulaParser.VariableReferenceEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#variableIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableIndex(FormulaParser.VariableIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#numeral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeral(FormulaParser.NumeralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(FormulaParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#rangeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeParameter(FormulaParser.RangeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#infinitySymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfinitySymbol(FormulaParser.InfinitySymbolContext ctx);
}