package com.efm.algorithms

import getOptimalValue
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FractionalKnapsackKtTest {

    @Test
    fun testGetOptimalValue() {
        assertEquals(180.0000, getOptimalValue(50, intArrayOf(60, 100, 120), intArrayOf(20, 50, 30)))
        assertEquals(166.6667, getOptimalValue(10, intArrayOf(500), intArrayOf(30)))
    }
}
