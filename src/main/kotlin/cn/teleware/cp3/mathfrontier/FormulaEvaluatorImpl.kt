package cn.teleware.cp3.mathfrontier

import cn.teleware.cp3.mathfrontier.impl.FormulaMethodCollection
import cn.teleware.cp3.mathfrontier.impl.executor.ExpExecutor
import cn.teleware.cp3.mathfrontier.impl.interpreter.FormulaExpInterpreter
import cn.teleware.cp3.mathfrontier.impl.interpreter.FormulaExpVariableExtractor

class FormulaEvaluatorImpl(
        formulaMethods: List<FormulaMethod>,
        variableCoercionStrategy: VariableCoercionStrategy
) : FormulaEvaluator {
    private val formulaMethodCollection = FormulaMethodCollection(formulaMethods)
    private val interpreter = FormulaExpInterpreter(formulaMethodCollection)
    private val executor = ExpExecutor(variableCoercionStrategy)
    private val varExtractor = FormulaExpVariableExtractor()

    override fun eval(formula: String, context: FormulaEvaluatingContext): FormulaEvaluateResult {
        val exp = interpreter.interpret(formula)
        return executor.execute(formula, exp, context.variableProvider)
    }

    override fun getVariables(formula: String): List<String> {
        return varExtractor.extractVariables(formula)
    }
}