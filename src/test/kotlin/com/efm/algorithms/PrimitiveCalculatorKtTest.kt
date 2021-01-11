package com.efm.algorithms

import optimalSequence
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PrimitiveCalculatorKtTest {

    @Test
    fun testOptimalSequence() {
        var sequence = optimalSequence(1)
        assertEquals(0, sequence)
////        for (x in sequence) {
////            print("$x ")
////        }
////
        sequence = optimalSequence(5)
        assertEquals(3, sequence)
//        for (x in sequence) {
//            print("$x ")
//        }
////
        sequence = optimalSequence(96234)
        assertEquals(14, sequence)
//        for (x in sequence) {
//            print("$x ")
//        }
    }
}
