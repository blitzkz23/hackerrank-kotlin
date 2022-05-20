package com.naufaldystd.hackerrank.implementation.easy

import com.google.common.truth.Truth.assertThat
import com.naufaldystd.hackerrank.implementation.easy.MigratoryBirds.migratoryBirds
import org.junit.Test

internal class MigratoryBirdsTest {
	private val expectedResult = 4

	@Test
	fun `return true if result is equal to expected result`() {
		val result = migratoryBirds(arrayOf(1, 4, 4, 4, 5, 3))

		assertThat(result).isEqualTo(expectedResult)
	}
}