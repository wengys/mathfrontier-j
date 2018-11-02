package cn.teleware.cp3.mathfrontier

interface VariableCoercionStrategy {
    fun coerceValue(id:String, rawValue:Double?):Double
}