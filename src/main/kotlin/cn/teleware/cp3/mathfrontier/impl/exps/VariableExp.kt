package cn.teleware.cp3.mathfrontier.impl.exps

import cn.teleware.cp3.mathfrontier.VariableCoercionStrategy
import cn.teleware.cp3.mathfrontier.VariableProvider
import cn.teleware.cp3.mathfrontier.impl.ValueExp
import cn.teleware.cp3.mathfrontier.impl.executor.ExpExecuteContext

internal class VariableExp(
        private val varName: String
) : ValueExp {
    override fun evaluate(context: ExpExecuteContext): Double {
        val result = context.variables.getOrElse(varName) {
            val varValue = getVar(varName, context)
            context.addVariable(varName, varValue)
            varValue
        }
        return result
    }

    override fun toString(): String {
        return "\${$varName}"
    }

    private fun getVar(variableName: String, context: ExpExecuteContext): Double {
        val rawValue = getRawValue(variableName, context.variableProvider)
        return coerceValue(variableName, rawValue, context.variableCoercionStrategy)
    }

    private fun coerceValue(variableName: String, rawValue: Double?, variableCoercionStrategy: VariableCoercionStrategy): Double {
        return variableCoercionStrategy.coerceValue(variableName, rawValue)
    }

    private fun getRawValue(variableName: String, variableProvider: VariableProvider): Double? {
        return variableProvider.getVar(variableName)
    }
}