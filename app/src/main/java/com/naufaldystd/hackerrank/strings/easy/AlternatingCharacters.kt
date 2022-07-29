package com.naufaldystd.hackerrank.strings.easy

import com.naufaldystd.hackerrank.strings.easy.AlternatingCharacters.alternatingCharacters

object AlternatingCharacters {

	fun alternatingCharacters(s: String): Int {
		var delCount = 0
		var findMeMatch = s[0]
		for (i in 1 until s.length) {
			if (findMeMatch == 'A') {
				if (s[i] == 'A') {
					delCount++
				} else {
					findMeMatch = s[i]
					continue
				}
			} else {
				if (s[i] == 'A') {
					findMeMatch = s[i]
					continue
				} else {
					delCount++
				}
			}
		}

		return delCount
	}
}

fun main() {
	print(alternatingCharacters("ABBABBAA"))
}