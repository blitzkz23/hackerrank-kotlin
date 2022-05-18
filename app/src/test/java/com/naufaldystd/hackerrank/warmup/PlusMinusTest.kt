package com.naufaldystd.hackerrank.warmup

import com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.warmup.PlusMinus.plusMinus
import org.junit.Test

internal class PlusMinusTest {
	/**
	 * This test shows identical value between expected and result, but unit test fails idk.
	 */

	private val expectedResult = """
		0.5
		0.3333333333333333
		0.16666666666666666
	""".trimIndent()

	@Test
	fun `return true if printed result is equal to expected result`() {
		val output = tapSystemOut {
			plusMinus(arrayOf(-4, 3, -9, 0, 4, 1))
		}

		assertThat(output).isEqualTo(expectedResult)
	}
}