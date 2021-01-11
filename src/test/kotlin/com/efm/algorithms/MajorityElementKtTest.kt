package com.efm.algorithms

import getMajorityElement
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MajorityElementKtTest {

    @Test
    fun testGetMajorityElement() {
        val array1 = intArrayOf(2, 3, 9, 2, 2)
        val array2 = intArrayOf(1, 2, 3, 4)
        val array3 = intArrayOf(1, 2, 3, 1)
        val array4 = intArrayOf(1, 1, 1, 2, 2, 2, 2)
        val array5 = intArrayOf(2, 2, 2, 1, 1, 1, 1, 1)
        val array6 = intArrayOf(2, 2, 2, 4, 5, 6, 7, 8)
        val array7 = intArrayOf(1, 2)
        val array8 = intArrayOf(2, 2, 2, 4, 5, 5, 2, 2)
        val array9 = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val array10 = intArrayOf(1, 2, 3, 1, 1, 1, 1, 8, 9, 1)
        assertEquals(2, getMajorityElement(array1, 0, array1.size))
        assertEquals(-1, getMajorityElement(array2, 0, array2.size))
        assertEquals(-1, getMajorityElement(array3, 0, array3.size))
        assertEquals(2, getMajorityElement(array4, 0, array4.size))
        assertEquals(1, getMajorityElement(array5, 0, array5.size))
        assertEquals(-1, getMajorityElement(array6, 0, array6.size))
        assertEquals(-1, getMajorityElement(array7, 0, array7.size))
        assertEquals(2, getMajorityElement(array8, 0, array8.size))
        assertEquals(-1, getMajorityElement(array9, 0, array9.size))
        assertEquals(1, getMajorityElement(array10, 0, array10.size))
    }
}
