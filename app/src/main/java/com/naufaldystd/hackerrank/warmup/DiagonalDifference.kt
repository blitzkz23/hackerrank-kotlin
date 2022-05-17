package com.naufaldystd.hackerrank.warmup

import kotlin.math.abs

object DiagonalDifference {

	fun diagonalDifference(arr: Array<Array<Int>>): Int {
		val n = arr.size
		var d1 = 0
		var d2 = 0

		for (i in arr.indices) {
			d1 += arr[i][i]
			d2 += arr[i][n-i-1]
		}

		return abs(d1-d2)
	}
}