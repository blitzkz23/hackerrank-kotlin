package com.naufaldystd.hackerrank.warmup

object PlusMinus {

	fun plusMinus(arr: Array<Int>): Unit {
		var plusCount = 0.0
		var minusCount = 0.0
		var zeroCount = 0.0

		for (i in arr.indices) {
			when {
				arr[i] > 0 -> {
					plusCount++
				}
				arr[i] < 0 -> {
					minusCount++
				}
				arr[i] == 0 -> {
					zeroCount++
				}
			}
		}

		print("""
			${plusCount/arr.size} 
			${minusCount/arr.size}
			${zeroCount/arr.size}
		""".trimIndent())
	}
}