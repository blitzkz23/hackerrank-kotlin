package com.naufaldystd.hackerrank.sorting.insertion

import com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.sorting.insertion.InsertionSort2.insertionSort2
import org.junit.Test

internal class InsertionSort2Test {
	/**
	 * This unit test still fail even through the expected output already equal to the actual output idk why
	 */

	private val expectedOutput = """
		7 8 6 5 4 3 2 1
		6 7 8 5 4 3 2 1
		5 6 7 8 4 3 2 1
		4 5 6 7 8 3 2 1
		3 4 5 6 7 8 2 1
		2 3 4 5 6 7 8 1
		1 2 3 4 5 6 7 8
	""".trimIndent()

	@Test
	fun `return true if printed output is equal to expected output` () {
		val output = tapSystemOut {
			insertionSort2(8, arrayOf(8, 7, 6, 5, 4, 3, 2, 1))
		}

		assertThat(output.trimIndent()).isEqualTo(expectedOutput)
	}
}