package com.naufaldystd.hackerrank.warmup

import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.warmup.DiagonalDifference.diagonalDifference
import org.junit.Test


internal class DiagonalDifferenceTest {

	private val expectedResult = 15

	@Test
	fun `return true if result is equal to expected result`() {
		val arrayInput = arrayOf(
			arrayOf(11, 2, 4),
			arrayOf(4, 5, 6),
			arrayOf(10, 8, -12)
		)
		val result = diagonalDifference(arrayInput)

		assertThat(result).isEqualTo(expectedResult)
	}
}