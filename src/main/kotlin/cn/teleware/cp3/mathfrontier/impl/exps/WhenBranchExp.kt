package cn.teleware.cp3.mathfrontier.impl.exps

import cn.teleware.cp3.mathfrontier.impl.Exp
import cn.teleware.cp3.mathfrontier.impl.LogicExp
import cn.teleware.cp3.mathfrontier.impl.ValueExp
import cn.teleware.cp3.mathfrontier.impl.executor.ExpExecuteContext
import cn.teleware.cp3.mathfrontier.impl.exps.logic.RangeExp

internal class WhenBranchExp(
        private val condition: LogicExp,
        private val result: ValueExp
) : Exp {

    override fun toString(): String {
        return "$condition => $result"
    }

    fun accept(context: ExpExecuteContext): Boolean {
        return condition.accept(context)
    }

    fun executeResult(context: ExpExecuteContext) : Double {
        return result.evaluate(context)
    }
}