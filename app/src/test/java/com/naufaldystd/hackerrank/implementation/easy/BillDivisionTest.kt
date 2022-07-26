package com.naufaldystd.hackerrank.implementation.easy

import com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.implementation.easy.BillDivision.bonAppetit
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class BillDivisionTest {
	private val expectedResult = "Bon Appetit"
	private val expectedResult2 = "5"

	@Test
	fun `return true if result is equal to expected result`() {
		val output = tapSystemOut {
			bonAppetit(arrayOf(40, 39, 97, 5, 2, 84, 35, 93, 59, 39), 2, 198)
		}

		assertThat(output.trimIndent()).isEqualTo(expectedResult)
	}

	@Test
	fun `return true if result is equal to expected result 2`() {
		val output = tapSystemOut {
			bonAppetit(arrayOf(3, 10, 2, 9), 1, 12)
		}

		assertThat(output.trimIndent()).isEqualTo(expectedResult2)
	}
}