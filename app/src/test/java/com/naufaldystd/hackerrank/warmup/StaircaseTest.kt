package com.naufaldystd.hackerrank.warmup

import com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.warmup.Staircase.staircase
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

		assertThat(output.trimIndent()).isEqualTo(expectedResult)
	}
}