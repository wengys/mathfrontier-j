package cn.teleware.cp3.mathfrontier.impl.interpreter

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.util.*
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class FormulaExpVariableExtractorTests(
        private val formula: String,
        private val expected: List<String>
) {

    @Test
    fun test() {
        val extractor = FormulaExpVariableExtractor()
        val actual = extractor.extractVariables(formula)
        assertEquals(expected.size, actual.size)
        expected.forEachIndexed { index, e -> assertEquals(e, actual[index]) }
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): Collection<Array<Any>> {
            return Arrays.asList(
                    arrayOf("1", emptyList<String>()),
                    arrayOf("(1+2) * 3", emptyList<String>()),
                    //
                    arrayOf("1.0%", emptyList<String>()),
                    arrayOf("-1.0%", emptyList<String>()),
                    //
                    arrayOf("\${a}", listOf("a")),
                    arrayOf("\${参数}", listOf("参数")),
                    //
                    arrayOf("Cls.Call0()", emptyList<String>()),
                    arrayOf("Cls.Call(1)", emptyList<String>()),
                    arrayOf("Cls.Call(\${参数})", listOf("参数")),
                    //
                    arrayOf("when(1){:`[1,2)`=>3;:`(4,infinity]`=>6;else=>0}", emptyList<String>()),
                    arrayOf(
                            "when(\${参数1}){:`[1,\${参数2})`=>3;:`(4,infinity]`=>\${参数3};else=>\${参数4}}",
                            listOf("参数1","参数2","参数3","参数4")
                    )
            )
        }
    }
}