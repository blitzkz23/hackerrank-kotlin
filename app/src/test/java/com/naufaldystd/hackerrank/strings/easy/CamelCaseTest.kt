package com.naufaldystd.hackerrank.strings.easy

import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.strings.easy.CamelCase.camelCase
import org.junit.Test

internal class CamelCaseTest {
	private val expectedResult = 3

	@Test
	fun `return true if result is equal to expected result`() {
		val result = camelCase("helloThereBoi")

		assertThat(result).isEqualTo(expectedResult)
	}
}