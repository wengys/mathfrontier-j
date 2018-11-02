package cn.teleware.cp3.mathfrontier.impl.exps

import cn.teleware.cp3.mathfrontier.impl.ValueExp
import cn.teleware.cp3.mathfrontier.impl.executor.ExpExecuteContext

internal object NullExp : ValueExp {
    override fun evaluate(context: ExpExecuteContext): Double {
        throw NotImplementedError("NEVER")
    }

    override fun toString(): String {
        return "null"
    }
}