package cn.teleware.cp3.mathfrontier

import cn.teleware.cp3.mathfrontier.impl.Exp

interface FormulaExpressionCache {
    fun getOrBuildExpression(formula: String, formulaModelCreator: () -> Exp): Exp
}