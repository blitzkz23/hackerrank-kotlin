package com.naufaldystd.hackerrank.implementation.easy

import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.implementation.easy.DivisibleSumPairs.divisibleSumPairs
import org.junit.Test

internal class DivisibleSumPairsTest {
	private val expectedResult = 5

	@Test
	fun `return true if result is equal to expected result`() {
		val result = divisibleSumPairs(6, 3, arrayOf(1, 3, 2, 6, 1, 2))

		assertThat(result).isEqualTo(expectedResult)
	}
}