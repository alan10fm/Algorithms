package com.efm.algorithms

import calcFib
import org.junit.jupiter.api.Test

internal class FibonacciKtTest {

    @Test
    fun testCalcFib() {
        println(calcFib(0))
        println(calcFib(1))
        println(calcFib(2))
        println(calcFib(10))
        println(calcFib(20))
        println(calcFib(30))
        println(calcFib(40))
        println(calcFib(45))
    }
}
