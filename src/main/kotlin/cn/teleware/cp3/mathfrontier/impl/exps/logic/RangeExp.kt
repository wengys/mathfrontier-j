package cn.teleware.cp3.mathfrontier.impl.exps.logic

import cn.teleware.cp3.mathfrontier.impl.LogicExp
import cn.teleware.cp3.mathfrontier.impl.ValueExp
import cn.teleware.cp3.mathfrontier.impl.executor.ExpExecuteContext
import cn.teleware.cp3.mathfrontier.impl.exps.InfinityExp

internal class RangeExp(
        private val value: ValueExp,
        private val leftOpen: Boolean,
        private val left: ValueExp,
        private val right: ValueExp,
        private val rightOpen: Boolean
) : LogicExp {
    override fun accept(context: ExpExecuteContext): Boolean {
        val v = value.evaluate(context)
        if(left !is InfinityExp) {
            val leftValue = left.evaluate(context)
            if((leftOpen && v <= leftValue) || (!leftOpen && v < leftValue )) {
                return false
            }
        }
        if(right !is InfinityExp) {
            val rightValue = right.evaluate(context)
            if((rightOpen && rightValue <= v) || (!rightOpen && rightValue < v )) {
                return false
            }
        }
        return true
    }

    override fun toString(): String {
        return "$value in ${if(leftOpen){'('}else{'['}} $left, $right ${if(rightOpen){')'}else{']'}}"
    }
}