package cn.teleware.cp3.mathfrontier.impl.exps

import cn.teleware.cp3.mathfrontier.impl.Exp
import cn.teleware.cp3.mathfrontier.impl.ValueExp
import cn.teleware.cp3.mathfrontier.impl.executor.ExpExecuteContext

internal class ElseBranchExp(
        private val result: ValueExp
) : Exp {

    override fun toString(): String {
        return "else => $result"
    }

    fun executeResult(context: ExpExecuteContext) : Double {
        return result.evaluate(context)
    }
}