package com.naufaldystd.hackerrank.warmup

import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.warmup.AVeryBigSum.aVeryBigSum
import org.junit.Test


internal class AVeryBigSumTest {
	val expectedResult = 5000000015

	@Test
	fun `return true if result is equal to expected result`() {
		val result = aVeryBigSum(arrayOf(1000000001, 1000000002, 1000000003, 1000000004, 1000000005))

		assertThat(result).isEqualTo(expectedResult)
	}
}