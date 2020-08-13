package com.efm.algorithms

import gcdNaive
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class GCDKtTest {

    @Test
    fun testGcdNaive() {
        assertEquals(gcdNaive(18, 35), 1)
        assertEquals(gcdNaive(28851538, 1183019), 17657)
    }
}
