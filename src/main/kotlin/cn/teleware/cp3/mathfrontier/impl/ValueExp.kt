package cn.teleware.cp3.mathfrontier.impl

import cn.teleware.cp3.mathfrontier.impl.executor.ExpExecuteContext

internal interface ValueExp:Exp {
    fun evaluate(context: ExpExecuteContext): Double
}