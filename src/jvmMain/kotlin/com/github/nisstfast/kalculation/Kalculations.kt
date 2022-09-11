package com.github.nisstfast.kalculation

import kotlin.math.pow
import kotlin.math.sqrt

fun Random(first: Long , second: Long) : Long {
    val RandomR = (first..second).random()
    return RandomR
}

fun Plus(first: Long , second: Long) : Long {
    val PlusR = first + second
    return PlusR
}

fun Minus(first: Long , second: Long) : Long {
    val MinusR = first - second
    return MinusR
}

fun Square(first: Double , second: Double) : Double {
    val SquareR = first.pow(second)
    return SquareR
}

fun Round(first: Double, second: Long) : Double {
    val i = Math.pow(10.0 , second.toDouble())
    val RoundR = Math.round(first * i) / i
    return RoundR
}

fun Root(first: Double) : Double {
    val RootR = sqrt(first)
    return RootR
}f