package com.naufaldystd.hackerrank

import com.naufaldystd.hackerrank.CanvasForTryingCode.cobaFunctionArr

object CanvasForTryingCode {

	fun cobaFunctionArr(arr: Array<String>) {
		print(arr[0].toCharArray().distinct().count() { kata -> arr.all { kalimat -> kalimat.contains(kata) }} )
	}
}

fun main() {
	cobaFunctionArr(arrayOf("abc", "abc", "bc", "cc"))
}