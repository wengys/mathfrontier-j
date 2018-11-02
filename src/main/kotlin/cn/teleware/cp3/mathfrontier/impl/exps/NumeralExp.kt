package cn.teleware.cp3.mathfrontier.impl.exps

import cn.teleware.cp3.mathfrontier.impl.ValueExp
import cn.teleware.cp3.mathfrontier.impl.executor.ExpExecuteContext

internal class NumeralExp(
        private val value: Double
) : ValueExp {
    override fun evaluate(context: ExpExecuteContext): Double {
        return value
    }

    override fun toString(): String {
        return "$value"
    }
}
