package com.efm.algorithms

import getFibonacciLastDigitNaive
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FibonacciLastDigitKtTest {

    @Test
    fun testGetFibonacciLastDigitNaive() {
        assertEquals(getFibonacciLastDigitNaive(3), 2)
        assertEquals(getFibonacciLastDigitNaive(331), 9)
        assertEquals(getFibonacciLastDigitNaive(327305), 5)
    }
}
