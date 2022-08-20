package com.naufaldystd.hackerrank.sorting.insertion

import com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.sorting.insertion.InsertionSort1.insertionSort1
import org.junit.Test

internal class InsertionSort1Test {
	/**
	 * This unit test still fail even through the expected output already equal to the actual output idk why
	 */

	private val expectedResult = """
		2 3 4 5 6 7 8 9 10 10
		2 3 4 5 6 7 8 9 9 10
		2 3 4 5 6 7 8 8 9 10
		2 3 4 5 6 7 7 8 9 10
		2 3 4 5 6 6 7 8 9 10
		2 3 4 5 5 6 7 8 9 10
		2 3 4 4 5 6 7 8 9 10
		2 3 3 4 5 6 7 8 9 10
		2 2 3 4 5 6 7 8 9 10
		1 2 3 4 5 6 7 8 9 10
	""".trimIndent()

	@Test
	fun `return true if printed result is equal to expected result`() {
		val output = tapSystemOut {
			insertionSort1(10, arrayOf(2, 3, 4, 5, 6, 7, 8, 9, 10, 1))
		}

		assertThat(output.trimIndent()).isEqualTo(expectedResult)
	}
}