package com.naufaldystd.hackerrank.implementation.easy

import android.os.Build
import androidx.annotation.RequiresApi
import com.naufaldystd.hackerrank.implementation.easy.MigratoryBirds.migratoryBirds

object MigratoryBirds {

	@RequiresApi(Build.VERSION_CODES.N)
	fun migratoryBirds(arr: Array<Int>): Int {
		val birdType = mutableMapOf<Int, Int>()
		val keyAndFrequency = arrayOf(0, 0)
		arr.forEach {
			birdType.compute(it) { key, value ->
				val frequency = if (value == null) 1 else value + 1
				if (frequency > keyAndFrequency[1] || frequency == keyAndFrequency[1] && key < keyAndFrequency[0]) {
					keyAndFrequency[0] = key
					keyAndFrequency[1] = frequency
				}
				frequency
			}
		}
		return keyAndFrequency[0]
	}
}

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
	print(migratoryBirds(arrayOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)))
}