package com.efm.algorithms

import lcmNaive
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LCMKtTest {

    @Test
    fun testLcmNaive() {
        assertEquals(lcmNaive(6, 8), 24)
        assertEquals(lcmNaive(761457, 614573), 467970912861)
    }
}
