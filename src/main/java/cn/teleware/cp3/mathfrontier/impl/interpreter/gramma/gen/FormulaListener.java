// Generated from E:/workspace_java/mathfrontier-j/document\Formula.g4 by ANTLR 4.7

package cn.teleware.cp3.mathfrontier.impl.interpreter.gramma.gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FormulaParser}.
 */
public interface FormulaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FormulaParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(FormulaParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(FormulaParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumeralValue}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumeralValue(FormulaParser.NumeralValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumeralValue}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumeralValue(FormulaParser.NumeralValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionDiv}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDiv(FormulaParser.ExpressionDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionDiv}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDiv(FormulaParser.ExpressionDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionWhen}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionWhen(FormulaParser.ExpressionWhenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionWhen}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionWhen(FormulaParser.ExpressionWhenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(FormulaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(FormulaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionMult}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMult(FormulaParser.ExpressionMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionMult}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMult(FormulaParser.ExpressionMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionMinus}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMinus(FormulaParser.ExpressionMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionMinus}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMinus(FormulaParser.ExpressionMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodInvok}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvok(FormulaParser.MethodInvokContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodInvok}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvok(FormulaParser.MethodInvokContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketsExpression}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBracketsExpression(FormulaParser.BracketsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketsExpression}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBracketsExpression(FormulaParser.BracketsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionPlus}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPlus(FormulaParser.ExpressionPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionPlus}
	 * labeled alternative in {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPlus(FormulaParser.ExpressionPlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#whenExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhenExpression(FormulaParser.WhenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#whenExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhenExpression(FormulaParser.WhenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#whenBranches}.
	 * @param ctx the parse tree
	 */
	void enterWhenBranches(FormulaParser.WhenBranchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#whenBranches}.
	 * @param ctx the parse tree
	 */
	void exitWhenBranches(FormulaParser.WhenBranchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#whenBranch}.
	 * @param ctx the parse tree
	 */
	void enterWhenBranch(FormulaParser.WhenBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#whenBranch}.
	 * @param ctx the parse tree
	 */
	void exitWhenBranch(FormulaParser.WhenBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#whenCondition}.
	 * @param ctx the parse tree
	 */
	void enterWhenCondition(FormulaParser.WhenConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#whenCondition}.
	 * @param ctx the parse tree
	 */
	void exitWhenCondition(FormulaParser.WhenConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpression(FormulaParser.LogicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpression(FormulaParser.LogicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#leftOmittedLogicExpression}.
	 * @param ctx the parse tree
	 */
	void enterLeftOmittedLogicExpression(FormulaParser.LeftOmittedLogicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#leftOmittedLogicExpression}.
	 * @param ctx the parse tree
	 */
	void exitLeftOmittedLogicExpression(FormulaParser.LeftOmittedLogicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#elseBranch}.
	 * @param ctx the parse tree
	 */
	void enterElseBranch(FormulaParser.ElseBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#elseBranch}.
	 * @param ctx the parse tree
	 */
	void exitElseBranch(FormulaParser.ElseBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#logicSymbol}.
	 * @param ctx the parse tree
	 */
	void enterLogicSymbol(FormulaParser.LogicSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#logicSymbol}.
	 * @param ctx the parse tree
	 */
	void exitLogicSymbol(FormulaParser.LogicSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#cmpSymbol}.
	 * @param ctx the parse tree
	 */
	void enterCmpSymbol(FormulaParser.CmpSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#cmpSymbol}.
	 * @param ctx the parse tree
	 */
	void exitCmpSymbol(FormulaParser.CmpSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(FormulaParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(FormulaParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(FormulaParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(FormulaParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#methodParameterPart}.
	 * @param ctx the parse tree
	 */
	void enterMethodParameterPart(FormulaParser.MethodParameterPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#methodParameterPart}.
	 * @param ctx the parse tree
	 */
	void exitMethodParameterPart(FormulaParser.MethodParameterPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#methodParameterList}.
	 * @param ctx the parse tree
	 */
	void enterMethodParameterList(FormulaParser.MethodParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#methodParameterList}.
	 * @param ctx the parse tree
	 */
	void exitMethodParameterList(FormulaParser.MethodParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#methodParameter}.
	 * @param ctx the parse tree
	 */
	void enterMethodParameter(FormulaParser.MethodParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#methodParameter}.
	 * @param ctx the parse tree
	 */
	void exitMethodParameter(FormulaParser.MethodParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(FormulaParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(FormulaParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#variableReferenceStart}.
	 * @param ctx the parse tree
	 */
	void enterVariableReferenceStart(FormulaParser.VariableReferenceStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#variableReferenceStart}.
	 * @param ctx the parse tree
	 */
	void exitVariableReferenceStart(FormulaParser.VariableReferenceStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#variableReferenceEnd}.
	 * @param ctx the parse tree
	 */
	void enterVariableReferenceEnd(FormulaParser.VariableReferenceEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#variableReferenceEnd}.
	 * @param ctx the parse tree
	 */
	void exitVariableReferenceEnd(FormulaParser.VariableReferenceEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#variableIndex}.
	 * @param ctx the parse tree
	 */
	void enterVariableIndex(FormulaParser.VariableIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#variableIndex}.
	 * @param ctx the parse tree
	 */
	void exitVariableIndex(FormulaParser.VariableIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#numeral}.
	 * @param ctx the parse tree
	 */
	void enterNumeral(FormulaParser.NumeralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#numeral}.
	 * @param ctx the parse tree
	 */
	void exitNumeral(FormulaParser.NumeralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(FormulaParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(FormulaParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#rangeParameter}.
	 * @param ctx the parse tree
	 */
	void enterRangeParameter(FormulaParser.RangeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#rangeParameter}.
	 * @param ctx the parse tree
	 */
	void exitRangeParameter(FormulaParser.RangeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#nullSymbol}.
	 * @param ctx the parse tree
	 */
	void enterNullSymbol(FormulaParser.NullSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#nullSymbol}.
	 * @param ctx the parse tree
	 */
	void exitNullSymbol(FormulaParser.NullSymbolContext ctx);
}