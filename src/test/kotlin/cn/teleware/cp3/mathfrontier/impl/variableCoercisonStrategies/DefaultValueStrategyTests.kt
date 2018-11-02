package cn.teleware.cp3.mathfrontier.impl.variableCoercisonStrategies

import org.junit.Test
import kotlin.test.assertEquals

class DefaultValueStrategyTests {
    @Test
    fun defaultWhenNull() {
        val strategy = DefaultValueStrategy()
        val expected = 0.0

        val actual = strategy.coerceValue("foo", null)
        assertEquals(expected,actual )
    }
    @Test
    fun rawWhenNotNull() {
        val strategy = DefaultValueStrategy()
        val expected = 123.45

        val actual = strategy.coerceValue("foo", expected)
        assertEquals(expected,actual )
    }
}

