package cn.teleware.cp3.mathfrontier.impl.exps.logic

import cn.teleware.cp3.mathfrontier.impl.LogicExp
import cn.teleware.cp3.mathfrontier.impl.executor.ExpExecuteContext

internal class AndExp(
        private val left: LogicExp,
        private val right: LogicExp
):LogicExp {
    override fun accept(context: ExpExecuteContext): Boolean {
        return left.accept(context) && right.accept(context)
    }

    override fun toString(): String {
        return "($left && $right)"
    }
}