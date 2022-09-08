package com.github.nisstfast.kalculation

fun RandomK(first: Long, second: Long) : Long {
    val RandomR = (first..second).random()
    return RandomR
}

fun PlusK(first: Long, second: Long) : Long {
    val PlusR = first + second
    return PlusR
}

fun MinusK(first: Long, second: Long) : Long {
    val MinusR = first - second
    return MinusR
}