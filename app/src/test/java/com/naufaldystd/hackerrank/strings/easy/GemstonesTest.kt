package com.naufaldystd.hackerrank.strings.easy

import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.strings.easy.Gemstones.gemstones
import org.junit.Test

internal class GemstonesTest {
	private val expectedResult = 0

	@Test
	fun `return true if result is equal to expectedResult`() {
		val result = gemstones(arrayOf("vtrjvgbj", "mkmjyaeav", "sibzdmsk"))

		assertThat(result).isEqualTo(expectedResult)
	}
}