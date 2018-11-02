package cn.teleware.cp3.mathfrontier.impl.exps.logic

import cn.teleware.cp3.mathfrontier.impl.LogicExp
import cn.teleware.cp3.mathfrontier.impl.ValueExp
import cn.teleware.cp3.mathfrontier.impl.executor.ExpExecuteContext

internal class LessOrEqualExp(
        private val left: ValueExp,
        private val right: ValueExp
): LogicExp {
    override fun accept(context: ExpExecuteContext): Boolean {
        return left.evaluate(context) <= right.evaluate(context)
    }

    override fun toString(): String {
        return "($left <= $right)"
    }
}