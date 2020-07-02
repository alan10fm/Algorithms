package com.efm.algorithms

import org.junit.jupiter.api.Test

internal class APlusB {

    @Test
    fun testSum() {
        assert(5 == sumIntegers(2, 3))
        assert(50 == sumIntegers(40, 10))
        assert(55 == sumIntegers(30, 25))
        assert(555 == sumIntegers(500, 55))
        assert(0 != sumIntegers(5, 0))
    }
}
