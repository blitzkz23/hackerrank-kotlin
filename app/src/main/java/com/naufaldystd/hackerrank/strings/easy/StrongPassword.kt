package com.naufaldystd.hackerrank.strings.easy

import com.naufaldystd.hackerrank.strings.easy.StrongPassword.minimumNumber

object StrongPassword {

	fun minimumNumber(n: Int, password: String): Int {
		val lowercase = Regex(".*[a-z]+.*")
		val uppercase = Regex(".*[A-Z]+.*")
		val numbers = Regex(".*[0-9]+.*")
		val specialChar = Regex(".*[-!@#$%^&*()+]+.*")

		var minNumber = 0
		val lengthDifference = 6 - n
		if (!(password.matches(numbers))) minNumber++
		if (!(password.matches(specialChar))) minNumber++
		if (!(password.matches(lowercase))) minNumber++
		if (!(password.matches(uppercase))) minNumber++

		if (lengthDifference > 0 && minNumber <= lengthDifference) return lengthDifference
		return  minNumber
	}
}

fun main() {
	print(minimumNumber(3, "Ab1"))
}