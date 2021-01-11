package com.efm.algorithms

import lcs2
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LCS2KtTest {

    @Test
    fun testLcs2() {
        assertEquals(2, lcs2(intArrayOf(2, 7, 5), intArrayOf(2, 5)))
        assertEquals(0, lcs2(intArrayOf(7), intArrayOf(1, 2, 3, 4)))
        assertEquals(2, lcs2(intArrayOf(2, 7, 8, 3), intArrayOf(5, 2, 8, 7)))
    }
}
