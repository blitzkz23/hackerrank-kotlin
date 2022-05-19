package com.naufaldystd.hackerrank.implementation.easy

import com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.implementation.easy.AppleAndOrange.countApplesAndOranges
import org.junit.Test


internal class AppleAndOrangeTest {
	private val expectedResult = """
		1
		1
	""".trimIndent()

	@Test
	fun `return true if printed result is equal to expected result`() {
		val output = tapSystemOut {
			countApplesAndOranges(7, 11, 5, 15, arrayOf(-2, 2, 1), arrayOf(5, -6))
		}

		assertThat(output.trimIndent()).isEqualTo(expectedResult)
	}
}