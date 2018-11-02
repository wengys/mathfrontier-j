package cn.teleware.cp3.mathfrontier.impl.interpreter

import cn.teleware.cp3.mathfrontier.FormulaMethod
import cn.teleware.cp3.mathfrontier.exceptions.SyntaxErrorException
import cn.teleware.cp3.mathfrontier.impl.Exp
import cn.teleware.cp3.mathfrontier.impl.interpreter.gramma.gen.FormulaBaseVisitor
import cn.teleware.cp3.mathfrontier.impl.interpreter.gramma.gen.FormulaLexer
import cn.teleware.cp3.mathfrontier.impl.interpreter.gramma.gen.FormulaParser
import cn.teleware.cp3.mathfrontier.impl.ValueExp
import cn.teleware.cp3.mathfrontier.impl.FormulaMethodCollection
import cn.teleware.cp3.mathfrontier.impl.exps.*
import cn.teleware.cp3.mathfrontier.impl.interpreter.gramma.gen.FormulaBaseListener
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.atn.ATNConfigSet
import org.antlr.v4.runtime.dfa.DFA
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.util.*

internal class FormulaExpVariableExtractor : FormulaExpInterpreterSupport() {
    fun extractVariables(formula: String): List<String> {
        val tree = getAST(formula)
        val listener = FormulaVariableListener()
        ParseTreeWalker.DEFAULT.walk(listener, tree)
        return listener.variables
    }
}

private class FormulaVariableListener : FormulaBaseListener() {
    val variables = mutableListOf<String>()
    override fun enterVariableIndex(ctx: FormulaParser.VariableIndexContext) {
        variables.add(ctx.text)
        super.enterVariableIndex(ctx)
    }
}

