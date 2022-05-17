package com.naufaldystd.hackerrank_warmup

import com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank_warmup.Staircase.staircase
import org.junit.Assert.assertEquals
import org.junit.Test

internal class StaircaseTest {
	private val expectedResult = """
           #
          ##
         ###
        ####
    """.trimIndent()

	@Test
	fun `return true if printed result is same as expected result`() {
		val output = tapSystemOut {
			staircase(4)
		}

		assertEquals(expectedResult, output.trimIndent())
	}
}