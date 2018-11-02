package cn.teleware.cp3.mathfrontier.impl.executor

import cn.teleware.cp3.mathfrontier.VariableProvider
import cn.teleware.cp3.mathfrontier.exceptions.CoerceVariableFailException
import cn.teleware.cp3.mathfrontier.impl.exps.DivExp
import cn.teleware.cp3.mathfrontier.impl.exps.NumeralExp
import cn.teleware.cp3.mathfrontier.impl.exps.PlusExp
import cn.teleware.cp3.mathfrontier.impl.exps.VariableExp
import cn.teleware.cp3.mathfrontier.impl.variableCoercisonStrategies.NullNotAllowedStrategy
import org.junit.Test
import kotlin.test.assertFailsWith

class ExceptionHandlingTests {
    @Test
    fun notExistingVariableTest() {
        val evaluator = ExpExecutor(NullNotAllowedStrategy())
        val formula = "\${a} + \${b} + 3"
        val exp = PlusExp(
                PlusExp(
                        VariableExp("a"),
                        VariableExp("b")
                ),NumeralExp(3.0)
        )

        assertFailsWith(CoerceVariableFailException::class) {
            evaluator.execute(formula, exp, variableProvider())
        }
    }

    @Test
    fun oneDivByZeroTest() {
        val evaluator = ExpExecutor(NullNotAllowedStrategy())
        val formula = "1.0/0.0"
        val exp = DivExp(
                NumeralExp(1.0),
                NumeralExp(0.0)
        )

        assertFailsWith(ArithmeticException::class, {
            evaluator.execute(formula, exp, variableProvider())
        })
    }

    @Test
    fun zeroDivByZeroTest() {
        val evaluator = ExpExecutor(NullNotAllowedStrategy())
        val formula = "0.0/0.0"
        val exp = DivExp(
                NumeralExp(0.0),
                NumeralExp(0.0)
        )

        assertFailsWith(ArithmeticException::class) {
            evaluator.execute(formula, exp, variableProvider())
        }
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
}