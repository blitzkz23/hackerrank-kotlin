package com.naufaldystd.hackerrank.warmup

import java.text.SimpleDateFormat
import java.util.*


object TimeConversion {

	fun timeConversion(s: String): String {
		val dateFormat12 = SimpleDateFormat("hh:mm:ssa", Locale.US)
		val dateFormat24 = SimpleDateFormat("HH:mm:ss", Locale.US)
		return dateFormat24.format(dateFormat12.parse(s))
	}
}