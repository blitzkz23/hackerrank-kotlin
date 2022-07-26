package com.naufaldystd.hackerrank.strings.easy

import com.naufaldystd.hackerrank.strings.easy.FunnyString.funnyString
import kotlin.math.abs

object FunnyString {

	fun funnyString(s: String):String {
		val reverseString = s.reversed()
		var asciiArray = arrayOf<Int>()
		var reverseAsciiArray = arrayOf<Int>()
		var diffArrNormal = arrayOf<Int>()
		var diffArrReversed = arrayOf<Int>()

		for (i in s.indices) {
			asciiArray += s[i].code
			reverseAsciiArray += reverseString[i].code
		}
		for (i in asciiArray.indices) {
			if (i != 0) {
				diffArrNormal += abs(asciiArray[i] - asciiArray[i-1])
				diffArrReversed += abs(reverseAsciiArray[i] - reverseAsciiArray[i-1])
			}
		}

		val isFunny = diffArrNormal.contentEquals(diffArrReversed)
		return if (isFunny) "Funny" else "Not Funny"
	}
}

fun main() {
	print(funnyString("uvzxrumuztyqyvpnji"))
}