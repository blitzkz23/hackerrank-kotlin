package com.naufaldystd.hackerrank.warmup

object Staircase {

	fun main(args: Array<String>) {
		val n = readLine()!!.trim().toInt()

		staircase(n)
	}

	fun staircase(n: Int): Unit {
		/** Logic Explanation
		 * untuk setiap i pada looping pertama dalam RANGE jumlah n hingga 1 (looping membentuk baris)
		 *  untuk setiap j pada looping dalam range 1 hingga jumlah n (looping membentuk kolom)
		 *      jika index j lebih dari sama dengan index i pada loop kedua maka print #
		 *      (misal pada index i = 2, akan ada looping j = 1, 2, 3, 4 sehingga pada index j mulai dari = 2
		 *      sudah mengeluarkan "#")
		 *          else print space kosong
		 **/

		for(i in n downTo 1) {
			for(j in 1..n) {
				if(j >= i) print('#')
				else print(' ')
			}
			println("")
		}

		// Solusi 2
//    for (i in 1..n) {
//        for (j in 1..n) {
//            if (j <= n - i) print(' ')
//            else print('#')
//        }
//        println()
//    }
	}
}