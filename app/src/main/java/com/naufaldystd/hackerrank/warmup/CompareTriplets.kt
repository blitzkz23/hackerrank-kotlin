package com.naufaldystd.hackerrank.warmup

object CompareTriplets {

	fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
		/**
		 * Logic Explanation
		 * buat variabel untuk menampung nilai Alice dan Bob
		 * untuk setiap i pada indeks dari array a
		 *  jika nilai a pada looping ke-i lebih dari b pada looping ke-i, tambah nilai alice
		 *  lain jika b pada looping ke-i lebih dari a pada looping ke-i, tambah nilai bob
		 *  lain jika nilai mereka sama lanjutkan looping
		 * return sebuah array yang berisi nilai Alice dan Bob
		 */

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