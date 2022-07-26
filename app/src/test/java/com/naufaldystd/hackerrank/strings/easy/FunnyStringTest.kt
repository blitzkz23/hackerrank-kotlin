package com.naufaldystd.hackerrank.strings.easy

import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.strings.easy.FunnyString.funnyString
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class FunnyStringTest {
	private val expectedResult = "Funny"
	private val expectedResult2 = "Not Funny"

	@Test
	fun `return true if result is equal to expectedResult`() {
		val result = funnyString("ovyvzvptyvpvpxyztlrztsrztztqvrxtxuxq")

		assertThat(result).isEqualTo(expectedResult)
	}

	@Test
	fun `return true if result is equal to expectedResult2`() {
		val result = funnyString("holtm")

		assertThat(result).isEqualTo(expectedResult2)
	}


}