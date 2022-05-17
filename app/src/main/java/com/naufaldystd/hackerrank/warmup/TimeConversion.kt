package com.naufaldystd.hackerrank.warmup

import java.text.SimpleDateFormat
import java.util.*


object TimeConversion {
	/** Logic Explanation
	 * format pertama adalah format 12 jam yang berakhiran AM atau PM seperti di soal
	 * format kedua adalah format 24 jam seperti yang dikehendaki soal
	 * parse string input dengan format pertama lalu format dengan format kedua dan return nilainya
	 */

	fun timeConversion(s: String): String {
		val dateFormat12 = SimpleDateFormat("hh:mm:ssa", Locale.US)
		val dateFormat24 = SimpleDateFormat("HH:mm:ss", Locale.US)
		return dateFormat24.format(dateFormat12.parse(s))
	}
}