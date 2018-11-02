package cn.teleware.cp3.mathfrontier.impl

import cn.teleware.cp3.mathfrontier.FormulaMethod
import java.util.stream.Collectors

internal class FormulaMethodCollection(fms:List<FormulaMethod>) {
    private val formulaMethods:Map<String,FormulaMethod> =
            fms.stream().collect(Collectors.toMap({it.methodName},{it}))

    fun getMethod(methodName:String):FormulaMethod? {
        return formulaMethods[methodName]
    }
}