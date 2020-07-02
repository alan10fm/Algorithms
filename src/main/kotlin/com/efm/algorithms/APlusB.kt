package com.efm.algorithms

import java.util.*

fun sumIntegers(a: Int, b: Int) = a + b

fun main(args: Array<String>) {
    val s = Scanner(System.`in`)
    val a = s.nextInt()
    val b = s.nextInt()
    println(sumIntegers(a,b))
}
