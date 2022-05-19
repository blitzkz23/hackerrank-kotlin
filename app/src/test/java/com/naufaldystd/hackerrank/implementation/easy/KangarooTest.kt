package com.naufaldystd.hackerrank.implementation.easy

import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.implementation.easy.Kangaroo.kangaroo
import org.junit.Test

internal class KangarooTest {
	private val expectedResult = "NO"

	@Test
	fun `return true if result is equal to expected result`() {
		val result = kangaroo(0, 2, 5, 3)

		assertThat(result).isEqualTo(expectedResult)
	}
}