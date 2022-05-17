package com.naufaldystd.hackerrank.warmup

import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.warmup.BirthdayCakeCandles.birthdayCakeCandles
import org.junit.Test

internal class BirthdayCakeCandlesTest {
	private val expectedResult = 2

	@Test
	fun `return true if result is equal to expected result`() {
		val result = birthdayCakeCandles(arrayOf(44, 53, 31, 27, 77, 60, 66, 77, 26, 36))

		assertThat(result).isEqualTo(expectedResult)
	}
}