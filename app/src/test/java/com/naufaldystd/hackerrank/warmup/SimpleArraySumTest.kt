package com.naufaldystd.hackerrank.warmup

import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.warmup.SimpleArraySum.simpleArraySum
import org.junit.Test


internal class SimpleArraySumTest {
	val expectedResult = 31

	@Test
	fun `return true if result is equal to expected result`() {
		val result = simpleArraySum(arrayOf(1, 2, 3, 4, 10, 11))

		assertThat(result).isEqualTo(expectedResult)
	}
}