package com.naufaldystd.hackerrank.warmup

object CompareTriplets {

	fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
		var alicePoints = 0
		var bobPoints = 0

		for (i in a.indices) {
			if (a[i] > b[i]) {
				alicePoints++
			} else if (a[i] < b[i]) {
				bobPoints++
			} else if (a[i] == b[i]) {
				continue
			}
		}

		return arrayOf(alicePoints, bobPoints)
	}
}