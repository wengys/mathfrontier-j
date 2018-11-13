package cn.teleware.cp3.mathfrontier.impl.variableCoercisonStrategies

import cn.teleware.cp3.mathfrontier.VariableCoercionStrategy
import cn.teleware.cp3.mathfrontier.exceptions.CoerceVariableFailException

object NullNotAllowedStrategy : VariableCoercionStrategy {
    override fun coerceValue(id: String, rawValue: Double?): Double {
        return rawValue ?: throw CoerceVariableFailException(id, rawValue)
    }
}