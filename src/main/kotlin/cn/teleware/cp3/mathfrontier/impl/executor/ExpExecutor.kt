package cn.teleware.cp3.mathfrontier.impl.executor

import cn.teleware.cp3.mathfrontier.FormulaEvaluateResult
import cn.teleware.cp3.mathfrontier.VariableCoercionStrategy
import cn.teleware.cp3.mathfrontier.VariableProvider
import cn.teleware.cp3.mathfrontier.impl.ValueExp

internal class ExpExecutor(
        private val variableCoercionStrategy: VariableCoercionStrategy
) {
    fun execute(formula: String, valueExp: ValueExp, variableProvider: VariableProvider): FormulaEvaluateResult {
        val context = ExpExecuteContext(
                formula,
                variableProvider,
                variableCoercionStrategy
        )
        val resultValue = valueExp.evaluate(context)
        return FormulaEvaluateResult(resultValue, context.variables)
    }
}

internal class ExpExecuteContext(
        val formula: String,
        val variableProvider: VariableProvider,
        val variableCoercionStrategy: VariableCoercionStrategy
) {

    private val internalVariableStore: MutableMap<String, Double> = mutableMapOf()

    public val variables: Map<String, Double> = internalVariableStore

    fun addVariable(varName: String, varValue: Double) {
        internalVariableStore[varName] = varValue
    }
}