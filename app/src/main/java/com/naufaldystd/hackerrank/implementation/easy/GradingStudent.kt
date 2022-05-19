package com.naufaldystd.hackerrank.implementation.easy

import com.naufaldystd.hackerrank.implementation.easy.GradingStudent.gradingStudents


object GradingStudent {

	fun gradingStudents(grades: Array<Int>): Array<Int> {
		val finalGrade = mutableListOf<Int>()
		for (i in grades.indices) {
			if ((grades[i] >= 38)) {
				when {
					(grades[i] + 2) % 5 == 0 -> {
						val roundedGrade = grades[i] + 2
						finalGrade.add(roundedGrade)
					}
					(grades[i] + 1) % 5 == 0 -> {
						val roundedGrade = grades[i] + 1
						finalGrade.add(roundedGrade)
					}
					else -> {
						finalGrade.add(grades[i])
					}
				}
			} else {
				finalGrade.add(grades[i])
			}
		}

		return finalGrade.toTypedArray()
	}
}

fun main() {
	gradingStudents(
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
}
