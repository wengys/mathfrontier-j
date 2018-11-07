package cn.teleware.cp3.mathfrontier.impl

import cn.teleware.cp3.mathfrontier.impl.executor.ExpExecuteContext

public interface Exp

internal interface LogicExp: Exp {
    fun accept(context: ExpExecuteContext): Boolean
}