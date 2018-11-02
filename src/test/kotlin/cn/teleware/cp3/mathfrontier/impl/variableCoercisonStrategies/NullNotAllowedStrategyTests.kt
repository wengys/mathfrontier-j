package cn.teleware.cp3.mathfrontier.impl.variableCoercisonStrategies

import cn.teleware.cp3.mathfrontier.exceptions.CoerceVariableFailException
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class NullNotAllowedStrategyTests {
    @Test
    fun throwWhenNull() {
        val strategy = NullNotAllowedStrategy()

        assertFailsWith(CoerceVariableFailException::class) {
            strategy.coerceValue("foo", null)
        }
    }

    @Test
    fun rawWhenNotNull() {
        val strategy = NullNotAllowedStrategy()
        val expected = 123.45

        val actual = strategy.coerceValue("foo", expected)
        assertEquals(expected, actual)
    }
}