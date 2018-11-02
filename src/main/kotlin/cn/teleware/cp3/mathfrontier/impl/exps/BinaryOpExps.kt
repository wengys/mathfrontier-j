package cn.teleware.cp3.mathfrontier.impl.exps

import cn.teleware.cp3.mathfrontier.impl.ValueExp
import cn.teleware.cp3.mathfrontier.impl.executor.ExpExecuteContext

internal abstract class BinaryOpExp(
        val left: ValueExp,
        val right: ValueExp
) : ValueExp {
    operator fun component1() = left
    operator fun component2() = right

    protected fun getChildValue(child: ValueExp, context: ExpExecuteContext): Double {
        return child.evaluate(context)
    }
}

internal class PlusExp(
        left: ValueExp,
        right: ValueExp
) : BinaryOpExp(left, right) {
    override fun evaluate(context: ExpExecuteContext):Double {
        return getChildValue(left, context) + getChildValue(right, context)
    }

    override fun toString(): String {
        return "($left + $right)"
    }
}

internal class MinusExp(
        left: ValueExp,
        right: ValueExp
) : BinaryOpExp(left, right) {
    override fun evaluate(context: ExpExecuteContext): Double {
        return getChildValue(left, context) - getChildValue(right, context)
    }

    override fun toString(): String {
        return "($left - $right)"
    }
}

internal class MultExp(
        left: ValueExp,
        right: ValueExp
) : BinaryOpExp(left, right) {
    override fun evaluate(context: ExpExecuteContext): Double {
        return getChildValue(left, context) * getChildValue(right, context)
    }

    override fun toString(): String {
        return "($left * $right)"
    }
}

internal class DivExp(
        left: ValueExp,
        right: ValueExp
) : BinaryOpExp(left, right) {
    override fun evaluate(context: ExpExecuteContext): Double {
        val left = getChildValue(left, context)
        val right = getChildValue(right, context)
        val result = left / right

        if (result.isInfinite() || result.isNaN()) {
            throw ArithmeticException("公式 ${context.formula} 发生除数为零异常")
        }
        return result
    }

    override fun toString(): String {
        return "($left / $right)"
    }
}