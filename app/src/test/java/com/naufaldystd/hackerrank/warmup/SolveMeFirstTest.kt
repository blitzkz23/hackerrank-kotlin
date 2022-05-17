package com.naufaldystd.hackerrank.warmup

import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.warmup.SolveMeFirst
import com.naufaldystd.hackerrank.warmup.SolveMeFirst.solveMeFirst
import org.junit.Test

internal class SolveMeFirstTest {
	private val expectedResult = 5

	@Test
	fun `return true if result is equal to expected result`() {
		val result = solveMeFirst(2, 3)

		assertThat(result).isEqualTo(expectedResult)
	}
}