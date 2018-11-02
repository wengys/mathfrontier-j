package cn.teleware.cp3.mathfrontier.impl.exps

import cn.teleware.cp3.mathfrontier.FormulaMethod
import cn.teleware.cp3.mathfrontier.impl.ValueExp
import cn.teleware.cp3.mathfrontier.impl.executor.ExpExecuteContext

internal class MethodInvokExp(
        private val methodName: String,
        private val params: List<ValueExp>,
        private val formulaMethod: FormulaMethod
) : ValueExp {
    override fun evaluate(context: ExpExecuteContext): Double {
        val ps = params.map {
            it.evaluate(context)
        }
        val result = formulaMethod.invok(ps)
        return result
    }

    override fun toString(): String {
        return "$methodName(${params.asSequence().map { it.toString() }.joinToString(", ")})"
    }
}