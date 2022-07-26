package com.naufaldystd.hackerrank.implementation.easy

import com.naufaldystd.hackerrank.implementation.easy.BillDivision.bonAppetit

object BillDivision {

	fun bonAppetit(bill: Array<Int>, k: Int, b: Int) {
		var totalBill = 0

		for (i in bill.indices) {
			if (i != k) {
				totalBill += bill[i]
			}
		}

		var bActual = totalBill / 2
		val chargedBill = b - bActual
		if (chargedBill == 0) print("Bon Appetit") else println(chargedBill)
	}
}

fun main() {
	bonAppetit(arrayOf(3, 10, 2, 9), 1, 7)
}