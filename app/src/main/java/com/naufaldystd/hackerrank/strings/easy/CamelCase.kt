package com.naufaldystd.hackerrank.strings.easy

object CamelCase {

	fun camelCase(s: String): Int {
		var wordCount = 1

		for (i in s.indices) {
			if (s[i].isUpperCase()) {
				wordCount++
			}
		}

		return wordCount
	}
}