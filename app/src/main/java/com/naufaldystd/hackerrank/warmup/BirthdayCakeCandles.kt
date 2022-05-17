package com.naufaldystd.hackerrank.warmup

object BirthdayCakeCandles {

	fun birthdayCakeCandles(candles: Array<Int>): Int {
		var count = 0
		var tallestCandles = candles[0]

		for (i in candles.indices) {
			if (candles[i] > tallestCandles) {
				tallestCandles = candles[i]
				count = 1
			} else if (candles[i] == tallestCandles) {
				count++
			}
		}

		return count
	}
}