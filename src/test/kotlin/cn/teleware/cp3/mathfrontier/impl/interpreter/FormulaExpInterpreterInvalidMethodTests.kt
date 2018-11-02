package cn.teleware.cp3.mathfrontier.impl.interpreter

import cn.teleware.cp3.mathfrontier.FormulaMethod
import cn.teleware.cp3.mathfrontier.exceptions.SyntaxErrorException
import cn.teleware.cp3.mathfrontier.impl.FormulaMethodCollection
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.util.Arrays
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertFailsWith
import kotlin.test.fail

@RunWith(Parameterized::class)
class FormulaExpInterpreterInvalidMethodTests(
        private val formula: String,
        private val message: String
) {

    @Test
    fun test() {
        val interpreter = FormulaExpInterpreter(fms())
        try {
            interpreter.interpret(formula)
            fail()
        } catch (exp: SyntaxErrorException) {
            assertEquals(message, exp.message)
        }
    }

    private fun fms(): FormulaMethodCollection =
            FormulaMethodCollection(listOf(
                    object: FormulaMethod {
                        override val methodName: String = "Cls.Call0"
                        override val methodParamCount: Int = 0
                        override fun invok(params: List<Double>): Double {
                            TODO("not implemented")
                        }

                    },
                    object: FormulaMethod {
                        override val methodName: String = "Cls.Call1"
                        override val methodParamCount: Int = 1
                        override fun invok(params: List<Double>): Double {
                            TODO("not implemented")
                        }

                    },
                    object: FormulaMethod {
                        override val methodName: String = "Cls.Call2"
                        override val methodParamCount: Int = 2
                        override fun invok(params: List<Double>): Double {
                            TODO("not implemented")
                        }

                    }
            ))

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): Collection<Array<Any>> {
            return Arrays.asList(
                    arrayOf<Any>("Foo.Bar()", "(Parser) 不支持的方法: Foo.Bar"),
                    arrayOf<Any>("Cls.Call0(1)", "(Parser) 参数数量错误: Cls.Call0 需要 0 个参数，实际 1 个"),
                    arrayOf<Any>("Cls.Bar()", "(Parser) 不支持的方法: Cls.Bar")
            )
        }
    }
}