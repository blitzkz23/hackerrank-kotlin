package com.naufaldystd.hackerrank.strings.easy

import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.strings.easy.StrongPassword.minimumNumber
import org.junit.Test


internal class StrongPasswordTest {
	private val expectedResult = 1

	@Test
	fun `return true if result is equal to expected result`() {
		val result = minimumNumber(11, "#Hackerrank")

		assertThat(result).isEqualTo(expectedResult)
	}
}