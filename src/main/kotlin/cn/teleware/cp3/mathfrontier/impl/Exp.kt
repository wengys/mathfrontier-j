package cn.teleware.cp3.mathfrontier.impl

import cn.teleware.cp3.mathfrontier.impl.executor.ExpExecuteContext

internal interface Exp

internal interface LogicExp: Exp {
    fun accept(context: ExpExecuteContext): Boolean
}

//internal interface LeftOmittedLogicExp {
//    fun accept(context: ExpExecuteContext)
//}