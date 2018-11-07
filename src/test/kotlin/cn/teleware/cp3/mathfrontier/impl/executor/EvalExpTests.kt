package cn.teleware.cp3.mathfrontier.impl.executor

import cn.teleware.cp3.mathfrontier.FormulaMethod
import cn.teleware.cp3.mathfrontier.VariableProvider
import cn.teleware.cp3.mathfrontier.impl.ValueExp
import cn.teleware.cp3.mathfrontier.impl.exps.*
import cn.teleware.cp3.mathfrontier.impl.exps.logic.AndExp
import cn.teleware.cp3.mathfrontier.impl.exps.logic.GreaterThanExp
import cn.teleware.cp3.mathfrontier.impl.exps.logic.LessOrEqualExp
import cn.teleware.cp3.mathfrontier.impl.exps.logic.RangeExp
import cn.teleware.cp3.mathfrontier.impl.variableCoercisonStrategies.NullNotAllowedStrategy
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.util.Arrays
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
internal class EvalExpTests(
        private val formula: String,
        private val valueExp: ValueExp,
        private val expected: Double,
        private val variableSize: Int
) {

    @Test
    fun test() {
        val evaluator = ExpExecutor(NullNotAllowedStrategy())
        val result = evaluator.execute(formula, valueExp, variableProvider())
        assertEquals(expected, result.resultValue)
        assertEquals(variableSize, result.variables.size)
    }

    private fun variableProvider(): VariableProvider {
        return object : VariableProvider {
            override fun getVar(varName: String): Double? {
                return when (varName) {
                    "a" -> 10.0
                    "参数" -> 20.0
                    "PI" -> Math.PI
                    else -> null
                }
            }
        }
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): Collection<Array<Any>> {
            return Arrays.asList(
                    arrayOf<Any>("1", NumeralExp(1.0), 1.0, 0),
                    arrayOf<Any>("-1", NumeralExp(-1.0), -1.0, 0),
                    arrayOf<Any>("1 + 2", PlusExp(NumeralExp(1.0), NumeralExp(2.0)), 3.0, 0),
                    arrayOf<Any>("1-2", MinusExp(NumeralExp(1.0), NumeralExp(2.0)), -1.0, 0),
                    arrayOf<Any>("1 + -2", PlusExp(NumeralExp(1.0), NumeralExp(-2.0)), -1.0, 0),
                    arrayOf<Any>("( 1 )", NumeralExp(1.0), 1.0, 0),
                    arrayOf<Any>("(1+2) * 3", MultExp(PlusExp(NumeralExp(1.0), NumeralExp(2.0)), NumeralExp(3.0)), 9.0, 0),
                    //
                    arrayOf<Any>("\${a}", VariableExp("a"), 10.0, 1),
                    arrayOf<Any>("\${参数}", VariableExp("参数"), 20.0, 1),
                    arrayOf<Any>("\${参数}+1", PlusExp(VariableExp("参数"), NumeralExp(1.0)), 21.0, 1),
                    arrayOf<Any>("1+\${参数}", PlusExp(NumeralExp(1.0), VariableExp("参数")), 21.0, 1),
                    arrayOf<Any>("(\${参数}+2)*3", MultExp(PlusExp(VariableExp("参数"), NumeralExp(2.0)), NumeralExp(3.0)), 66.0, 1),
                    //
                    arrayOf<Any>("Math.Abs(-1.0)", MethodInvokExp("Math.Abs", listOf(NumeralExp(-1.0)), abs()), 1.0, 0),
                    arrayOf<Any>("Math.Abs(\${PI})", MethodInvokExp("Math.Abs", listOf(NumeralExp(Math.PI)), abs()), Math.PI, 0),
                    //
                    arrayOf<Any>(
                            "when(1){:`[1,2)`=>3;:`(4,null]`=>6;else=>0}",
                            WhenExpressionExp(
                                    listOf(
                                            WhenBranchExp(RangeExp(NumeralExp(1.0),false, NumeralExp(1.0), NumeralExp(2.0), true), NumeralExp(3.0)),
                                            WhenBranchExp(RangeExp(NumeralExp(1.0),true, NumeralExp(4.0), InfinityExp, false), NumeralExp(6.0))
                                    ),
                                    ElseBranchExp(NumeralExp(0.0))
                            ),
                            3,
                            0
                    ),
                    arrayOf<Any>(
                            "when(11){ :>10 && <=11 => 100 ; else=>0 }",
                            WhenExpressionExp(
                                    listOf(
                                            WhenBranchExp(
                                                    AndExp(
                                                            GreaterThanExp(NumeralExp(11.0),NumeralExp(10.0)),
                                                            LessOrEqualExp(NumeralExp(11.0),NumeralExp(11.0))
                                                    ),
                                                    NumeralExp(100.0)
                                            )
                                    ),
                                    ElseBranchExp(NumeralExp(0.0))
                            ),
                            100,
                            0
                    )
            )
        }

        @JvmStatic
        private fun abs(): FormulaMethod {
            return object : FormulaMethod {
                override val methodName: String = "Math.Abs"
                override val methodParamCount: Int = 1
                override fun invok(params: List<Double>): Double {
                    return Math.abs(params[0])
                }

            }
        }
    }
}