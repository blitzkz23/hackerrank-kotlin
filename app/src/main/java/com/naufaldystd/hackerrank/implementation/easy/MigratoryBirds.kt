package com.naufaldystd.hackerrank.implementation.easy

import android.os.Build
import androidx.annotation.RequiresApi
import com.naufaldystd.hackerrank.implementation.easy.MigratoryBirds.migratoryBirds

object MigratoryBirds {

	@RequiresApi(Build.VERSION_CODES.N)
	fun migratoryBirds(arr: Array<Int>): Int {
		val birdType = mutableMapOf<Int, Int>()

		for (i in arr.indices) {
			if (!birdType.containsKey(arr[i])) birdType[arr[i]] = 1
			else if (birdType.containsKey(arr[i])) birdType.computeIfPresent(arr[i]) { _, v->v+1 }
		}

		val highestBirdCount = birdType.maxByOrNull { it.value }

		return highestBirdCount?.key!!
	}
}

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
	migratoryBirds(arrayOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4))
}