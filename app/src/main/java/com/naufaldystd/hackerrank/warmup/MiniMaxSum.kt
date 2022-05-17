package com.naufaldystd.hackerrank.warmup

object MiniMaxSum {

	fun miniMaxSum(arr: Array<Int>): Unit {
		var sum: Long = 0
		var max = 0
		var min = arr[0]

		for (i in arr.indices) {
			if (arr[i] > max) {
				max = arr[i]
			}
			if (arr[i] < min) {
				min = arr[i]
			}
			sum += arr[i]
		}

		print("${sum - max} ${sum - min}")
	}
}