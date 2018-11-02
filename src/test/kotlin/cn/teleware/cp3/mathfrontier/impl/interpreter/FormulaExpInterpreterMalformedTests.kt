package cn.teleware.cp3.mathfrontier.impl.interpreter

import cn.teleware.cp3.mathfrontier.exceptions.SyntaxErrorException
import cn.teleware.cp3.mathfrontier.impl.FormulaMethodCollection
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.util.Arrays
import kotlin.test.assertFailsWith

@RunWith(Parameterized::class)
class FormulaExpInterpreterMalformedTests(
        private val formula: String
) {

    @Test
    fun test() {
        val interpreter = FormulaExpInterpreter(FormulaMethodCollection(arrayListOf()))
        assertFailsWith(SyntaxErrorException::class) {
            interpreter.interpret(formula)
        }
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): Collection<Array<Any>> {
            return Arrays.asList(
                    arrayOf<Any>("1+"),
                    arrayOf<Any>("1+++1"),
                    arrayOf<Any>("1%1")
            )
        }
    }
}