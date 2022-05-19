package com.naufaldystd.hackerrank.implementation.easy

import com.naufaldystd.hackerrank.implementation.easy.GradingStudent.gradingStudents
import org.junit.Test
import org.junit.jupiter.api.Assertions.assertArrayEquals

internal class GradingStudentTest {
	private val expectedResult = arrayOf(
		85,
		95,
		21,
		0,
		18,
		100,
		18,
		62,
		30,
		61,
		55,
		0,
		45,
		2,
		29,
		55,
		61,
		40,
		14,
		4,
		29,
		100,
		37,
		23,
		46,
		9,
		80,
		62,
		20,
		40,
		51,
		100,
		60,
		47,
		4,
		86,
		61,
		70,
		17,
		45,
		6,
		1,
		95,
		95
	)

	@Test
	fun `return true if result is equal to expected result`() {
		val output = gradingStudents(
			arrayOf(
				84,
				94,
				21,
				0,
				18,
				100,
				18,
				62,
				30,
				61,
				53,
				0,
				43,
				2,
				29,
				53,
				61,
				40,
				14,
				4,
				29,
				98,
				37,
				23,
				46,
				9,
				79,
				62,
				20,
				38,
				51,
				99,
				59,
				47,
				4,
				86,
				61,
				68,
				17,
				45,
				6,
				1,
				95,
				95,
			)
		)

		assertArrayEquals(output, expectedResult)
	}
}