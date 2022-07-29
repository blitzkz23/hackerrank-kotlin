package com.naufaldystd.hackerrank.strings.easy

import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.strings.easy.AlternatingCharacters.alternatingCharacters
import org.junit.Test


internal class AlternatingCharactersTest {
	private val expectedResult = 6

	@Test
	fun `return true if result is equal to expected result`() {
		val result = alternatingCharacters("AAABBBAABB")

		assertThat(result).isEqualTo(expectedResult)
	}
}