package com.naufaldystd.hackerrank.sorting.insertion

import com.naufaldystd.hackerrank.sorting.insertion.InsertionSort1.insertionSort1


object InsertionSort1 {
	/**
	 * This problem is a simple version of insertion notes where, given an array and one unsorted number in the rightmost side, I need to sort it by comparing
	 * the unsorted one to the one on left side one by one.  If the current index on the loop is bigger than the unsorted one, switch that one to the right side
	 * an so on, until the array is sorted.
	 */

	fun insertionSort1(n: Int, arr: Array<Int>){
		//	Store last index array
		val lastIndex = arr[n - 1]

		//  This flag is used to break from looping before index out of bounds
		var finishFlag = false

		//	Compare to the leftmost
		for (currentIndex in arr.indices.reversed()) {
			if (currentIndex == 0) {
				arr[0] = lastIndex
			} else if (lastIndex < arr[currentIndex - 1]) {
				arr[currentIndex] = arr[currentIndex - 1]
			} else {
				arr[currentIndex] = lastIndex
				finishFlag = true
			}

			arr.forEach { print("$it ") }
			println()
			if (finishFlag) break
		}
	}
}

fun main() {
	insertionSort1(10, arrayOf(2, 3, 4, 5, 6, 7, 8, 9, 10, 1))
}