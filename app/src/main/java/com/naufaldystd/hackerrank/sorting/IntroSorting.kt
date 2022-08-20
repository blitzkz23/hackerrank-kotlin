package com.naufaldystd.hackerrank.sorting

import com.naufaldystd.hackerrank.sorting.IntroSorting.introTutorial

object IntroSorting {

	fun introTutorial(V: Int, arr: Array<Int>): Int {
		for ((index, value) in arr.withIndex()) {
			if (value == V) return index
		}
		return 0
	}
}

fun main() {
	print(introTutorial(4, arrayOf(1, 4, 5, 7, 9, 12)))
}