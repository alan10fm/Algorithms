package com.efm.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CarFuelingTest {

  @Test
  public void testComputeMinRefills() {
    assertEquals(CarFueling.computeMinRefills(950, 400, new int[]{200, 375, 550, 750}), -1);
    assertEquals(CarFueling.computeMinRefills(10, 3, new int[]{1, 2, 5, 9}), -1);
  }

}
