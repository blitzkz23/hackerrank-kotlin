package com.naufaldystd.hackerrank.strings.easy

import com.naufaldystd.hackerrank.strings.easy.Gemstones.gemstones

object Gemstones {

//	From given array, turn the rockCollection's string into char of array by using toCharArray()
//	Also apply distinct and count
//	If string of rockCollection includes gemTypes, count increase

	fun gemstones(arr: Array<String>): Int =
		arr[0].toCharArray().distinct().count { gemTypes -> arr.all { rockCollection -> rockCollection.contains(gemTypes) } }
}

fun main() {
	print(gemstones(arrayOf("basdfj", "asdlkjfdjsa", "bnafvfnsd", "oafhdlasd")))
}