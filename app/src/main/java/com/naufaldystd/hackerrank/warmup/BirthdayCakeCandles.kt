package com.naufaldystd.hackerrank.warmup

object BirthdayCakeCandles {

	fun birthdayCakeCandles(candles: Array<Int>): Int {
		/**
		 * Logic Explanation
		 * buat variabel penampung hitungan
		 * buat variabel tallestCandles dan set nilainya menjadi nilai array index-0
		 * untuk setiap i pada indeks array candles
		 *  jika indeks dari array candle pada loop ke-i lebih dari nilai tallestCandles, nilai tersebut menggantikan isi tallestCandles
		 *      mulai perhitungan baru = 1
		 *  lain jika indeks dari candle pada loop ke-i sama dengan tallestCandles, tambah perhitungan count
		 *  kembalikan nilai count
		 */

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