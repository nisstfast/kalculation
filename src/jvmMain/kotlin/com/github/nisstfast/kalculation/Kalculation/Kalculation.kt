package io.github.nisstfast.kalculation.Kalculation

import java.util.*


private val random = Random()

fun RandomK(first: Int, second: Int): Int {
    val second = second + 1
    return random.nextInt(second - first) + first
}