package com.naufaldystd.hackerrank.sorting.counting

import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.sorting.counting.CountingSort1.countingSort
import org.junit.Assert.assertArrayEquals
import org.junit.Test

internal class CountingSort1Test {
	private val expectedResult = arrayOf(0, 0, 1, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

	@Test
	fun `return true if result is equal to expected result` () {
		val result = countingSort(arrayOf(4, 5, 4, 2, 3))

		assertArrayEquals(result, expectedResult)
	}
}