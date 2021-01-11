package com.efm.algorithms

import binarySearch
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BinarySearchKtTest {

    @Test
    fun testBinarySearch() {
        assertEquals(binarySearch(intArrayOf(1, 5, 8, 12, 13), 8), 2)
        assertEquals(binarySearch(intArrayOf(1, 5, 8, 12, 13), 1), 0)
        assertEquals(binarySearch(intArrayOf(1, 5, 8, 12, 13), 23), -1)
        assertEquals(binarySearch(intArrayOf(1, 5, 8, 12, 13), 1), 0)
        assertEquals(binarySearch(intArrayOf(1, 5, 8, 12, 13), 11), -1)
        assertEquals(binarySearch(intArrayOf(1, 5, 8, 12, 13), 13), 4)
    }
}
