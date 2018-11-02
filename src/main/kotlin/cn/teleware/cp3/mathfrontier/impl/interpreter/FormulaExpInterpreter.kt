package cn.teleware.cp3.mathfrontier.impl.interpreter

import cn.teleware.cp3.mathfrontier.FormulaMethod
import cn.teleware.cp3.mathfrontier.exceptions.SyntaxErrorException
import cn.teleware.cp3.mathfrontier.impl.Exp
import cn.teleware.cp3.mathfrontier.impl.interpreter.gramma.gen.FormulaBaseVisitor
import cn.teleware.cp3.mathfrontier.impl.interpreter.gramma.gen.FormulaParser
import cn.teleware.cp3.mathfrontier.impl.ValueExp
import cn.teleware.cp3.mathfrontier.impl.FormulaMethodCollection
import cn.teleware.cp3.mathfrontier.impl.LogicExp
import cn.teleware.cp3.mathfrontier.impl.exps.*
import cn.teleware.cp3.mathfrontier.impl.exps.logic.*
import java.util.*
import kotlin.collections.ArrayList

internal class FormulaExpInterpreter(private val methodCollection: FormulaMethodCollection) : FormulaExpInterpreterSupport() {

    fun interpret(formula: String): ValueExp {
        val tree = getAST(formula)
        val visitor = FormulaVisitorImpl(methodCollection)
        val exp = visitor.visit(tree)
        return exp as ValueExp
    }
}

private class FormulaVisitorImpl(
        private val methodCollection: FormulaMethodCollection
) : FormulaBaseVisitor<Exp>() {

    val whenValueExpressions: Deque<ValueExp> = ArrayDeque<ValueExp>(3) // when 表达式的value部分

    override fun visitFormula(ctx: FormulaParser.FormulaContext): Exp {
        val formula = visit(ctx.expression())
        return formula
    }

    override fun visitExpressionDiv(ctx: FormulaParser.ExpressionDivContext): Exp {
        val (left, right) = ctx.expression().map { visit(it) as ValueExp }
        return DivExp(left, right)
    }

    override fun visitExpressionMult(ctx: FormulaParser.ExpressionMultContext): Exp {
        val (left, right) = ctx.expression().map { visit(it) as ValueExp }
        return MultExp(left, right)
    }

    override fun visitExpressionMinus(ctx: FormulaParser.ExpressionMinusContext): Exp {
        val (left, right) = ctx.expression().map { visit(it) as ValueExp }
        return MinusExp(left, right)
    }

    override fun visitBracketsExpression(ctx: FormulaParser.BracketsExpressionContext): Exp {
        return visit(ctx.expression())
    }

    override fun visitExpressionPlus(ctx: FormulaParser.ExpressionPlusContext): Exp {
        val (left, right) = ctx.expression().map { visit(it) as ValueExp }
        return PlusExp(left, right)
    }

    override fun visitMethodInvocation(ctx: FormulaParser.MethodInvocationContext): Exp {
        val methodName = ctx.methodName().text
        val paramPartExps = ctx.methodParameterPart()
                .methodParameterList() // 如果无参数，则为null
                ?.methodParameter()
                ?.map { visit(it) as ValueExp }
                ?: emptyList()
        val formulaMethod = getFormulaMethod(methodName, paramPartExps)
        return MethodInvokExp(methodName, paramPartExps, formulaMethod)
    }

    override fun visitWhenExpression(ctx: FormulaParser.WhenExpressionContext): Exp {
        val valueExp = visit(ctx.expression()) as ValueExp

        whenValueExpressions.push(valueExp)

        val whenBranchExps = ctx.whenBranches().whenBranch().map { visit(it) as WhenBranchExp }
        val elseBranchExp = visit(ctx.elseBranch()) as ElseBranchExp

        whenValueExpressions.pop()

        return WhenExpressionExp(whenBranchExps, elseBranchExp)
    }

    override fun visitWhenBranch(ctx: FormulaParser.WhenBranchContext): Exp {
        val conditionExp = visit(ctx.whenCondition()) as LogicExp
        val result = visit(ctx.expression()) as ValueExp
        return WhenBranchExp(conditionExp, result)
    }

    override fun visitLogicExpression(ctx: FormulaParser.LogicExpressionContext): Exp {
        if (ctx.logicSymbol() != null) {
            val left = visit(ctx.getChild(0)) as LogicExp
            val right = visit(ctx.getChild(2)) as LogicExp
            val symbol = ctx.logicSymbol().text
            return getLogicExp(symbol, left, right)
        } else if (ctx.cmpSymbol() != null) {
            val left = visit(ctx.getChild(0)) as ValueExp
            val right = visit(ctx.getChild(2)) as ValueExp
            val symbol = ctx.cmpSymbol().text
            return getCmpExp(symbol, left, right)
        }
        return super.visitLogicExpression(ctx)
    }

    override fun visitLeftOmittedLogicExpression(ctx: FormulaParser.LeftOmittedLogicExpressionContext): Exp {
        if (ctx.logicSymbol() != null) {
            val symbol = ctx.logicSymbol().text
            val left = visit(ctx.getChild(0)) as LogicExp
            val right = visit(ctx.getChild(2)) as LogicExp

            return getLogicExp(symbol, left, right)

        } else if (ctx.cmpSymbol() != null) {
            val symbol = ctx.cmpSymbol().text
            val left = whenValueExpressions.peek()
            val right = visit(ctx.getChild(2)) as ValueExp
            return getCmpExp(symbol, left, right)
        } else if(ctx.getChild(0).text == "(") { //括号
            return visit(ctx.getChild(1))
        }
        return super.visitLeftOmittedLogicExpression(ctx)
    }

    override fun visitElseBranch(ctx: FormulaParser.ElseBranchContext): Exp {
        val result = visit(ctx.expression()) as ValueExp
        return ElseBranchExp(result)
    }

    override fun visitRange(ctx: FormulaParser.RangeContext): Exp {
        val leftOpen = ctx.RangeStart().text == "`("
        val rightOpen = ctx.RangeEnd().text == ")`"
        val (left, right) = ctx.rangeParameter().map { visit(it) as ValueExp }
        val value = whenValueExpressions.peek()
        return RangeExp(value, leftOpen, left, right, rightOpen)
    }

    override fun visitRangeParameter(ctx: FormulaParser.RangeParameterContext): ValueExp {
        return if (ctx.nullSymbol() != null) {
            NullExp
        } else {
            visit(ctx.expression()) as ValueExp
        }
    }

    override fun visitVariableReference(ctx: FormulaParser.VariableReferenceContext): Exp {
        val varName = ctx.variableIndex().text
        return VariableExp(varName)
    }

    override fun visitNumeral(ctx: FormulaParser.NumeralContext): Exp {
        val text = ctx.text

        return if (text.endsWith('%')) {
            val valueText = text.substring(0, text.length - 1)
            val value = valueText.toDouble() / 100.0
            NumeralExp(value)
        } else {
            val value = text.toDouble()
            NumeralExp(value)
        }
    }

    private fun getFormulaMethod(methodName: String, params: List<Exp>): FormulaMethod {
        val method = methodCollection.getMethod(methodName)
                ?: throw SyntaxErrorException("Parser", "不支持的方法: $methodName")
        if (params.size != method.methodParamCount) {
            throw SyntaxErrorException("Parser", "参数数量错误: $methodName 需要 ${method.methodParamCount} 个参数，实际 ${params.size} 个")
        }
        return method
    }

    private fun getLogicExp(symbol: String, left: LogicExp, right: LogicExp): LogicExp {
        return when (symbol) {
            "&&" -> AndExp(left, right)
            "||" -> OrExp(left, right)
            else -> throw kotlin.IllegalStateException(symbol)
        }
    }


    private fun getCmpExp(symbol: String?, left: ValueExp, right: ValueExp): LogicExp {
        return when (symbol) {
            ">" -> GreaterThanExp(left, right)
            ">=" -> GreaterOrEqualExp(left, right)
            "<" -> LessThanExp(left, right)
            "<=" -> LessOrEqualExp(left, right)
            "==" -> EqualExp(left, right)
            else -> throw kotlin.IllegalStateException(symbol)
        }
    }
}

