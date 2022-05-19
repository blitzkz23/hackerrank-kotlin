package com.naufaldystd.hackerrank.implementation.easy

import com.naufaldystd.hackerrank.implementation.easy.Kangaroo.kangaroo

object Kangaroo {

	/**
	 * x1, x2 adalah posisi kangguru
	 * v1, v2 adalah jarak lompatan per meter tiap lompatan
	 *
	 * Logic Explanation
	 * Kondisi pertama ((x2-x1) * (v2-v1)) harus kurang dari 0, karena kedua kangguru memulai pada lokasi dan kecepatan berbeda, jika yang
	 * memulai pada lokasi lebih jauh lompatannya juga cepat maka kangguru yang satunya tidak akan bisa mengejarang
	 * Kondisi kedua ((x2-x1) % (v2-v1)) menggunakan konsep relatif velositas, jadi agar kedua kangguru bertemu pada titik yang sama nilainya harus 0
	 */

	fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
		return if (((x2 - x1) * (v2 - v1) < 0) && ((x2 - x1) % (v2 - v1) == 0)) "YES" else "NO"
	}
}

fun main() {
	print(kangaroo(0,2, 5, 3))
}