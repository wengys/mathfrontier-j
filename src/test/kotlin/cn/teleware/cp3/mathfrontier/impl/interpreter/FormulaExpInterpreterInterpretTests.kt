package cn.teleware.cp3.mathfrontier.impl.interpreter

import cn.teleware.cp3.mathfrontier.FormulaMethod
import cn.teleware.cp3.mathfrontier.impl.FormulaMethodCollection
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.util.Arrays
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class FormulaExpInterpreterInterpretTests(
        private val formula: String,
        private val expected: String
) {

    @Test
    fun test() {
        val interpreter = FormulaExpInterpreter(fms())
        val actual = interpreter.interpret(formula)
        val actualString = actual.toString()
        assertEquals(expected, actualString)
    }

    private fun fms(): FormulaMethodCollection =
            FormulaMethodCollection(listOf(
                    object : FormulaMethod {
                        override val methodName: String = "Cls.Call0"
                        override val methodParamCount: Int = 0
                        override fun invok(params: List<Double>): Double {
                            throw Exception()
                        }

                    },
                    object : FormulaMethod {
                        override val methodName: String = "Cls.Call"
                        override val methodParamCount: Int = 1
                        override fun invok(params: List<Double>): Double {
                            throw Exception()
                        }

                    },
                    object : FormulaMethod {
                        override val methodName: String = "Cls.Call2"
                        override val methodParamCount: Int = 2
                        override fun invok(params: List<Double>): Double {
                            throw Exception()
                        }

                    },
                    object : FormulaMethod {
                        override val methodName: String = "Cls.SubCall"
                        override val methodParamCount: Int = 1
                        override fun invok(params: List<Double>): Double {
                            throw Exception()
                        }

                    }
            ))

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): Collection<Array<Any>> {
            return Arrays.asList(
                    arrayOf<Any>("1", "1.0"),
                    arrayOf<Any>("-1", "-1.0"),
                    arrayOf<Any>("1%", "0.01"),
                    arrayOf<Any>("-1%", "-0.01"),
                    arrayOf<Any>("1 + 2", "(1.0 + 2.0)"),
                    arrayOf<Any>("1 + -2", "(1.0 + -2.0)"),
                    arrayOf<Any>("( 1 )", "1.0"),
                    arrayOf<Any>("(1+2) * 3", "((1.0 + 2.0) * 3.0)"),
                    //
                    arrayOf<Any>("1.0", "1.0"),
                    arrayOf<Any>("-1.0", "-1.0"),
                    arrayOf<Any>("1.0%", "0.01"),
                    arrayOf<Any>("-1.0%", "-0.01"),
                    arrayOf<Any>("1.0 + 2.0", "(1.0 + 2.0)"),
                    arrayOf<Any>("1.0 + -2.0", "(1.0 + -2.0)"),
                    arrayOf<Any>("( 1.0 )", "1.0"),
                    arrayOf<Any>("(1.0+2.0) * 3.0", "((1.0 + 2.0) * 3.0)"),
                    //
                    arrayOf<Any>("\${a}", "\${a}"),
                    arrayOf<Any>("\${参数}", "\${参数}"),
                    arrayOf<Any>("\${参数}+1", "(\${参数} + 1.0)"),
                    arrayOf<Any>("1 + \${参数}", "(1.0 + \${参数})"),
                    arrayOf<Any>("(\${参数} + 2) * 3", "((\${参数} + 2.0) * 3.0)"),
                    //
                    arrayOf<Any>("Cls.Call0()", "Cls.Call0()"),
                    arrayOf<Any>("Cls.Call(1)", "Cls.Call(1.0)"),
                    arrayOf<Any>("Cls.Call(\${参数})", "Cls.Call(\${参数})"),
                    arrayOf<Any>("Cls.Call(\${参数}) + 2", "(Cls.Call(\${参数}) + 2.0)"),
                    arrayOf<Any>("1 + Cls.Call(\${参数})", "(1.0 + Cls.Call(\${参数}))"),
                    arrayOf<Any>("Cls.Call2(\${参数}+1, 2)", "Cls.Call2((\${参数} + 1.0), 2.0)"),
                    arrayOf<Any>("Cls.Call2(Cls.SubCall(1), 2)", "Cls.Call2(Cls.SubCall(1.0), 2.0)"),
                    //
                    arrayOf<Any>(
                            "when(1){:`[1,2)`=>3;:`(4,infinity]`=>6;else=>0}",
                            "when { 1.0 in [ 1.0, 2.0 ) => 3.0; 1.0 in ( 4.0, infinity ] => 6.0; else => 0.0 }"
                    ),
                    arrayOf<Any>(
                            "when(\${参数1}){:`[1,\${参数2})`=>3;:`(4,infinity]`=>\${参数3};else=>\${参数4}}",
                            "when { \${参数1} in [ 1.0, \${参数2} ) => 3.0; \${参数1} in ( 4.0, infinity ] => \${参数3}; else => \${参数4} }"
                    ),
                    //
                    arrayOf<Any>(
                            "when(1){:`[1,2)` || :`[3,4)`=>5;else=>0}",
                            "when { (1.0 in [ 1.0, 2.0 ) || 1.0 in [ 3.0, 4.0 )) => 5.0; else => 0.0 }"
                    ),
                    arrayOf<Any>(
                            "when(1){:`[6,7)` && :`[8,9)`=>10;else=>0}",
                            "when { (1.0 in [ 6.0, 7.0 ) && 1.0 in [ 8.0, 9.0 )) => 10.0; else => 0.0 }"
                    ),
                    arrayOf<Any>(
                            "when(1){:>0 && :<1 =>2;\${参数}>3 && :<=4 => 5;else=>0}",
                            "when { ((1.0 > 0.0) && (1.0 < 1.0)) => 2.0; ((\${参数} > 3.0) && (1.0 <= 4.0)) => 5.0; else => 0.0 }"
                    ),
                    arrayOf<Any>(
                            "when(1){(:>0 && :<1) || (:>10 && :<20) =>2;else=>0}",
                            "when { (((1.0 > 0.0) && (1.0 < 1.0)) || ((1.0 > 10.0) && (1.0 < 20.0))) => 2.0; else => 0.0 }"
                    ),
                    arrayOf<Any>(
                            "when(1){:`[1,2)` || :`[3,4)`=>5;:`[6,7)` && :`[8,9)`=>10;:>11 && :<12 =>13;50>0 && :<=5 => 14;else=>0}",
                            "when { (1.0 in [ 1.0, 2.0 ) || 1.0 in [ 3.0, 4.0 )) => 5.0; (1.0 in [ 6.0, 7.0 ) && 1.0 in [ 8.0, 9.0 )) => 10.0; ((1.0 > 11.0) && (1.0 < 12.0)) => 13.0; ((50.0 > 0.0) && (1.0 <= 5.0)) => 14.0; else => 0.0 }"
                    ),
                    arrayOf<Any>(
                            "when(1){:>1&&:<2||:>3 => 10;else=>0}",
                            "when { (((1.0 > 1.0) && (1.0 < 2.0)) || (1.0 > 3.0)) => 10.0; else => 0.0 }"
                    ),
                    //
                    arrayOf<Any>(
                            "1+when(1){:`[1,2)`=>3;:`(4,infinity]`=>6;else=>0}-1",
                            "((1.0 + when { 1.0 in [ 1.0, 2.0 ) => 3.0; 1.0 in ( 4.0, infinity ] => 6.0; else => 0.0 }) - 1.0)"
                    )
            )
        }
    }
}