package cn.teleware.cp3.mathfrontier.impl.variableCoercisonStrategies

import cn.teleware.cp3.mathfrontier.VariableCoercionStrategy

object DefaultValueStrategy : VariableCoercionStrategy {
    override fun coerceValue(id: String, rawValue: Double?): Double {
        return rawValue?:0.0
    }
}