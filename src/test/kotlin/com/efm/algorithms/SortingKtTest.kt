package com.efm.algorithms

import org.junit.jupiter.api.Test
import randomizedQuickSort

internal class SortingKtTest {

    @Test
    public fun testPartition3() {
        var intArray = intArrayOf(2, 3, 9, 2, 2, 1, 5, 2, 3, 1, 0, 9, 8, 2)
        randomizedQuickSort(intArray, 0, 13)
        for (integer in intArray) {
            print("$integer ")
        }

//        var intArray2 = intArrayOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
//        randomizedQuickSort(intArray2, 0, 10)
//        for (integer in intArray2) {
//            print("$integer ")
//        }

//        assertEquals(intArrayOf(2, 2, 2, 3, 9), randomizedQuickSort(intArrayOf(2, 3, 9, 2, 2), 0, 4))
    }
}
