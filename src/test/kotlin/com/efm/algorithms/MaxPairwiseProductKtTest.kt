package com.efm.algorithms

import org.junit.jupiter.api.Test
import kotlin.random.Random

internal class MaxPairwiseProductKtTest {

    @Test
    fun getMaxPairwiseProductNormalTest() {
        assert(getMaxPairwiseProduct(intArrayOf(1, 2, 3, 4)) == 12L)
        assert(getMaxPairwiseProduct(intArrayOf(10, 0, 3)) == 30L)
        assert(getMaxPairwiseProduct(intArrayOf(1, 2, 35, 1)) == 70L)
        assert(getMaxPairwiseProduct(intArrayOf(100000, 90000)) == 9000000000L)
    }
}
