package com.naufaldystd.hackerrank.warmup

import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.warmup.CompareTriplets.compareTriplets
import org.junit.Test

internal class CompareTripletsTest {

	val expectedResult = arrayOf(2, 1)

	@Test
	fun `return true if result is equal to expected result`() {
		val result = compareTriplets(arrayOf(17, 28, 30), arrayOf(99, 16, 8))

		assertThat(result).isEqualTo(expectedResult)
	}
}