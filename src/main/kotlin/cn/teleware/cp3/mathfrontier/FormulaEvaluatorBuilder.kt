package cn.teleware.cp3.mathfrontier

import cn.teleware.cp3.mathfrontier.impl.Exp
import cn.teleware.cp3.mathfrontier.impl.variableCoercisonStrategies.DefaultValueStrategy
import cn.teleware.cp3.mathfrontier.impl.variableCoercisonStrategies.NullNotAllowedStrategy
import java.util.concurrent.ConcurrentHashMap

class FormulaEvaluatorBuilder private constructor() {
    private var formulaMethods: List<FormulaMethod> = emptyList()
    private var variableCoercionStrategy: VariableCoercionStrategy = NullNotAllowedStrategy
    private var formulaCache: FormulaExpressionCache? = null

    fun withFormulaMethods(formulaMethods: List<FormulaMethod>): FormulaEvaluatorBuilder {
        this.formulaMethods = formulaMethods
        return this
    }

    fun withVariableNotAllowedNull(): FormulaEvaluatorBuilder {
        this.variableCoercionStrategy = NullNotAllowedStrategy
        return this
    }

    fun withVariableDefaultWhenNulll(): FormulaEvaluatorBuilder {
        this.variableCoercionStrategy = DefaultValueStrategy
        return this
    }

    fun withLocalFormulaCache(): FormulaEvaluatorBuilder {
        this.formulaCache = createLocalCache()
        return this
    }

    fun withVariableCoercionStrategy(strategy: VariableCoercionStrategy): FormulaEvaluatorBuilder {
        this.variableCoercionStrategy = strategy
        return this
    }

    fun withFormulaCache(formulaCache: FormulaExpressionCache): FormulaEvaluatorBuilder {
        this.formulaCache = formulaCache
        return this
    }

    fun build(): FormulaEvaluator {
        return FormulaEvaluatorImpl(formulaMethods, variableCoercionStrategy, formulaCache)
    }

    private fun createLocalCache(): FormulaExpressionCache {
        return object : FormulaExpressionCache {
            private val cache = ConcurrentHashMap<String, Exp>()
            override fun getOrBuildExpression(formula: String, formulaModelCreator: () -> Exp): Exp {
                return cache.getOrPut(formula, formulaModelCreator)
            }
        }
    }

    companion object {
        val INSTANCE: FormulaEvaluatorBuilder
            get() {
                return FormulaEvaluatorBuilder()
            }
    }
}