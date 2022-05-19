package com.naufaldystd.hackerrank.implementation.easy

import com.naufaldystd.hackerrank.implementation.easy.AppleAndOrange.countApplesAndOranges

object AppleAndOrange {

	/**
	 * s and t adalah panjang rumah Sam
	 * a adalah posisi pohon apel, b adalah posisi pohon jeruk
	 */

	fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
		var appleHitHouseCount = 0
		var orangeHitHouseCount = 0

		// Count apple fall direction
		val applesFallDirection = mutableListOf<Int>()
		for (i in apples.indices) {
			val fallDistance = a + apples[i]
			applesFallDirection.add(fallDistance)
		}

		// Count orange fall direction
		val orangeFallDirection = mutableListOf<Int>()
		for (i in oranges.indices) {
			val fallDistance = b + oranges[i]
			orangeFallDirection.add(fallDistance)
		}

		// Count apple that hit Sam's house
		for (i in applesFallDirection.indices) {
			if (applesFallDirection[i] in s..t) {
				appleHitHouseCount++
			}
		}

		// Count orange that hit Sam's house
		for (i in orangeFallDirection.indices) {
			if (orangeFallDirection[i] in s..t) {
				orangeHitHouseCount++
			}
		}

		println(appleHitHouseCount)
		print(orangeHitHouseCount)
	}
}

fun main() {
	countApplesAndOranges(7, 10, 4, 12, arrayOf(2, 3, -4), arrayOf(3, -2, -4))
}