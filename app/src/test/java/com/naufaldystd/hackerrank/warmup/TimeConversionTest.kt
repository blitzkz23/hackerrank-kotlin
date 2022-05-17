package com.naufaldystd.hackerrank.warmup

import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.warmup.TimeConversion.timeConversion
import org.junit.Test

internal class TimeConversionTest {
	private val expectedResult = "19:05:45"

	@Test
	fun `return true if result is equal to expected result`() {
		val result = timeConversion("07:05:45PM")

		assertThat(result).isEqualTo(expectedResult)
	}
}