package com.naufaldystd.hackerrank.warmup

import com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.warmup.MiniMaxSum.miniMaxSum
import org.junit.Test


internal class MiniMaxSumTest {
	val expectedResult = "1640793344 2199437821"

	@Test
	fun `return true if printed result is equal to expected result`() {
		val output = tapSystemOut {
			miniMaxSum(arrayOf(769082435, 210437958, 673982045, 375809214, 380564127))
		}

		assertThat(output).isEqualTo(expectedResult)
	}
}