package com.efm.algorithms

import getChange
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ChangeKtTest {

    @Test
    fun testGetChange() {
        assertEquals(2, getChange(2))
        assertEquals(6, getChange(28))
    }
}


