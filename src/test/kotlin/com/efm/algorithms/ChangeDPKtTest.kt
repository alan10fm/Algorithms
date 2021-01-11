package com.efm.algorithms

import getChange
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ChangeDPKtTest {

    @Test
    fun testGetChangeDP() {
        assertEquals(2, getChange(2))
        assertEquals(9, getChange(34))
        assertEquals(3, getChange(11))
        assertEquals(7, getChange(25))
        assertEquals(1, getChange(3))
        assertEquals(1, getChange(4))
        assertEquals(2, getChange(5))
        assertEquals(3, getChange(10))

    }
}
