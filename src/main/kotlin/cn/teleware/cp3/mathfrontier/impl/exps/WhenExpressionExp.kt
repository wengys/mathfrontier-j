package cn.teleware.cp3.mathfrontier.impl.exps

import cn.teleware.cp3.mathfrontier.impl.ValueExp
import cn.teleware.cp3.mathfrontier.impl.executor.ExpExecuteContext

internal class WhenExpressionExp(
        private val whenBranchExps: List<WhenBranchExp>,
        private val elseBranchExp: ElseBranchExp
) : ValueExp {
    override fun evaluate(context: ExpExecuteContext) : Double {
        val branch = whenBranchExps.firstOrNull {
            it.accept(context)
        }
        return if(branch != null) {
            branch.executeResult(context)
        } else {
            elseBranchExp.executeResult(context)
        }
    }

    override fun toString(): String {
        return "when { ${whenBranchExps.joinToString(separator = "; ")}; $elseBranchExp }"
    }
}