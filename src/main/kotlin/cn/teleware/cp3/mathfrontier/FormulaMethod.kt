package cn.teleware.cp3.mathfrontier

interface FormulaMethod {
    val methodName:String
    val methodParamCount:Int
    fun invok(params:List<Double>):Double
}