package com.naufaldystd.hackerrank.warmup

import kotlin.math.abs

object DiagonalDifference {
	/** Logic Explanation
	 * untuk setiap i pada indeks dari array,
	 *  inkremen diagonal utama jika i1 dan i2 nilainya sama ([0][0] / [1][1] / [2][2]]) dimana indeks membentuk diagonal
	 *      inkremen diagonal sekondari jika i2 nilainya = n - i - 1
	 *          misal, pada i1 = 1, maka i2 bernilai 3 - 1 -1 == 1, sehingga posisinya di tengah pada indeks-1
	 *              kurangi diagonal utama dan diagonal sekondari lalu absolutkan nilainya
	 */

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