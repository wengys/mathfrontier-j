package cn.teleware.cp3.mathfrontier.impl.interpreter

import cn.teleware.cp3.mathfrontier.exceptions.SyntaxErrorException
import cn.teleware.cp3.mathfrontier.impl.interpreter.gramma.gen.FormulaLexer
import cn.teleware.cp3.mathfrontier.impl.interpreter.gramma.gen.FormulaParser
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.atn.ATNConfigSet
import org.antlr.v4.runtime.dfa.DFA
import java.util.*

open class FormulaExpInterpreterSupport {
    protected fun getAST(formula: String): FormulaParser.FormulaContext? {
        val input = CharStreams.fromString(formula)
        val lexer = FormulaLexer(input)
        lexer.removeErrorListeners()
        lexer.addErrorListener(LexerErrorListener.INSTANCE)
        val tokens = CommonTokenStream(lexer)
        val parser = FormulaParser(tokens)
        parser.removeErrorListeners()
        parser.addErrorListener(ParserErrorListener.INSTANCE)
        val tree = parser.formula()
        return tree
    }
}


private class LexerErrorListener : ANTLRErrorListener {
    override fun reportAttemptingFullContext(recognizer: Parser?, dfa: DFA?, startIndex: Int, stopIndex: Int, conflictingAlts: BitSet?, configs: ATNConfigSet?) {
    }

    override fun syntaxError(recognizer: Recognizer<*, *>?, offendingSymbol: Any?, line: Int, charPositionInLine: Int, msg: String?, e: RecognitionException?) {
        throw SyntaxErrorException("Lexer", "line $line:$charPositionInLine $msg")
    }

    override fun reportAmbiguity(recognizer: Parser?, dfa: DFA?, startIndex: Int, stopIndex: Int, exact: Boolean, ambigAlts: BitSet?, configs: ATNConfigSet?) {
    }

    override fun reportContextSensitivity(recognizer: Parser?, dfa: DFA?, startIndex: Int, stopIndex: Int, prediction: Int, configs: ATNConfigSet?) {
    }

    companion object {
        val INSTANCE = LexerErrorListener()
    }
}

private class ParserErrorListener : ANTLRErrorListener {
    override fun reportAttemptingFullContext(recognizer: Parser?, dfa: DFA?, startIndex: Int, stopIndex: Int, conflictingAlts: BitSet?, configs: ATNConfigSet?) {
    }

    override fun syntaxError(recognizer: Recognizer<*, *>?, offendingSymbol: Any?, line: Int, charPositionInLine: Int, msg: String?, e: RecognitionException?) {
        throw SyntaxErrorException("Parser", "line $line:$charPositionInLine $msg")
    }

    override fun reportAmbiguity(recognizer: Parser?, dfa: DFA?, startIndex: Int, stopIndex: Int, exact: Boolean, ambigAlts: BitSet?, configs: ATNConfigSet?) {
    }

    override fun reportContextSensitivity(recognizer: Parser?, dfa: DFA?, startIndex: Int, stopIndex: Int, prediction: Int, configs: ATNConfigSet?) {
    }

    companion object {
        val INSTANCE = LexerErrorListener()
    }
}