package com.naufaldystd.hackerrank.sorting.insertion

import com.naufaldystd.hackerrank.sorting.insertion.InsertionSort2.insertionSort2

object InsertionSort2 {

	/**
	 * Insertion algorithm explanation, rever to this link below:
	 * https://www.youtube.com/watch?v=JU767SDMDvA
	 */

	fun insertionSort2(n: Int, arr: Array<Int>) {
		for (currentIndex in arr.indices) {
			var j = currentIndex
			if (j == 0) {
				continue
			}
			while (j > 0 && arr[j] < arr[j - 1]) {
				val temp = arr[j - 1]
				arr[j - 1] = arr[j]
				arr[j] = temp
				j -= 1
			}
			arr.forEach { print("$it ") }
			println()
		}
	}
}

fun main() {
	insertionSort2(6, arrayOf(1, 4, 3, 5, 6, 2))
}