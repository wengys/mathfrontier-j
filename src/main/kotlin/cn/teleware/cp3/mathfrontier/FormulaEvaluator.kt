package cn.teleware.cp3.mathfrontier

interface FormulaEvaluator {
    fun getVariables(formula:String): List<String>
    fun eval(formula:String, context: FormulaEvaluatingContext):FormulaEvaluateResult
}

class FormulaEvaluateResult(
    val resultValue: Double,
    val variables: Map<String, Double>
)

interface FormulaEvaluatingContext {
    val variableProvider: VariableProvider
}