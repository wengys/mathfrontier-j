package cn.teleware.cp3.mathfrontier.exceptions

class CoerceVariableFailException(val id: String, val value: Double?) : Exception("无法正则化变量 ${id}，当前值为 $value")