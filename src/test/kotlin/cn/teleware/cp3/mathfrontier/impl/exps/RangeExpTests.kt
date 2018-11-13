package cn.teleware.cp3.mathfrontier.impl.exps

import cn.teleware.cp3.mathfrontier.VariableProvider
import cn.teleware.cp3.mathfrontier.impl.executor.ExpExecuteContext
import cn.teleware.cp3.mathfrontier.impl.exps.logic.RangeExp
import cn.teleware.cp3.mathfrontier.impl.variableCoercisonStrategies.NullNotAllowedStrategy
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.util.*
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
internal class RangeExpTests(
        private val range: RangeExp,
        private val expectAccepted: Boolean
) {

    @Test
    fun test() {
        val ctx = ExpExecuteContext("", object: VariableProvider{
            override fun getVar(varName: String): Double? {
                TODO("not implemented")
            }
        }, NullNotAllowedStrategy)

        val accepted = range.accept(ctx)
        assertEquals(expectAccepted, accepted)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): Collection<Array<Any>> {
            return Arrays.asList(
                    arrayOf(
                            RangeExp(
                                    NumeralExp(1.0),
                                    true,
                                    NumeralExp(1.0),
                                    NumeralExp(2.0),
                                    true
                            ),
                            false
                    ),
                    arrayOf(
                            RangeExp(
                                    NumeralExp(2.0),
                                    true,
                                    NumeralExp(1.0),
                                    NumeralExp(2.0),
                                    true
                            ),
                            false
                    ),
                    arrayOf(
                            RangeExp(
                                    NumeralExp(0.0),
                                    true,
                                    NumeralExp(1.0),
                                    NumeralExp(2.0),
                                    true
                            ),
                            false
                    ),
                    arrayOf(
                            RangeExp(
                                    NumeralExp(3.0),
                                    true,
                                    NumeralExp(1.0),
                                    NumeralExp(2.0),
                                    true
                            ),
                            false
                    ),
                    arrayOf(
                            RangeExp(
                                    NumeralExp(1.1),
                                    true,
                                    NumeralExp(1.0),
                                    NumeralExp(2.0),
                                    true
                            ),
                            true
                    ),
                    arrayOf(
                            RangeExp(
                                    NumeralExp(1.9),
                                    true,
                                    NumeralExp(1.0),
                                    NumeralExp(2.0),
                                    true
                            ),
                            true
                    ),
                    //
                    arrayOf(
                            RangeExp(
                                    NumeralExp(1.0),
                                    false,
                                    NumeralExp(1.0),
                                    NumeralExp(2.0),
                                    false
                            ),
                            true
                    ),
                    arrayOf(
                            RangeExp(
                                    NumeralExp(2.0),
                                    false,
                                    NumeralExp(1.0),
                                    NumeralExp(2.0),
                                    false
                            ),
                            true
                    ),
                    arrayOf(
                            RangeExp(
                                    NumeralExp(0.0),
                                    false,
                                    NumeralExp(1.0),
                                    NumeralExp(2.0),
                                    false
                            ),
                            false
                    ),
                    arrayOf(
                            RangeExp(
                                    NumeralExp(3.0),
                                    false,
                                    NumeralExp(1.0),
                                    NumeralExp(2.0),
                                    false
                            ),
                            false
                    ),
                    arrayOf(
                            RangeExp(
                                    NumeralExp(1.1),
                                    false,
                                    NumeralExp(1.0),
                                    NumeralExp(2.0),
                                    false
                            ),
                            true
                    ),
                    arrayOf(
                            RangeExp(
                                    NumeralExp(1.9),
                                    false,
                                    NumeralExp(1.0),
                                    NumeralExp(2.0),
                                    false
                            ),
                            true
                    ),
                    //
                    arrayOf(
                            RangeExp(
                                    NumeralExp(Double.MIN_VALUE),
                                    false,
                                    InfinityExp,
                                    NumeralExp(2.0),
                                    false
                            ),
                            true
                    ),
                    arrayOf(
                            RangeExp(
                                    NumeralExp(Double.MIN_VALUE),
                                    true,
                                    InfinityExp,
                                    NumeralExp(2.0),
                                    false
                            ),
                            true
                    ),
                    arrayOf(
                            RangeExp(
                                    NumeralExp(Double.MAX_VALUE),
                                    false,
                                    NumeralExp(1.0),
                                    InfinityExp,
                                    false
                            ),
                            true
                    ),
                    arrayOf(
                            RangeExp(
                                    NumeralExp(Double.MAX_VALUE),
                                    false,
                                    NumeralExp(1.0),
                                    InfinityExp,
                                    true
                            ),
                            true
                    ),
                    arrayOf(
                            RangeExp(
                                    NumeralExp(1.0),
                                    false,
                                    InfinityExp,
                                    InfinityExp,
                                    false
                            ),
                            true
                    )
            )
        }
    }
}