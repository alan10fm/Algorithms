package com.efm.algorithms

import getEditDistance
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class EditDistanceKtTest {

    @Test
    fun testGetEditDistance() {
        assertEquals(0, getEditDistance("ab", "ab"))
        assertEquals(3, getEditDistance("short", "ports"))
        assertEquals(5, getEditDistance("editing", "distance"))
        assertEquals(3, getEditDistance("horse", "ros"))
        assertEquals(1, getEditDistance("geek", "gesek"))
        assertEquals(1, getEditDistance("cat", "cut"))
        assertEquals(3, getEditDistance("sunday", "saturday"))
        assertEquals(5, getEditDistance("benyam", "ephrem"))
        assertEquals(1, getEditDistance("aabb", "abb"))
    }
}

//
// 26484736
// 536870912
