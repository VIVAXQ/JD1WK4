package com.kolesnikov.jd1.task1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CyclicShiftTest {

    @Test
    public void doCyclicShift() throws Exception {
        int[] testArray1 = {5, 1, 2, 3, 4};
        int[] funcionArray = {1, 2, 3, 4, 5};
        CyclicShift cyclicShift = new CyclicShift();
        int[] testArray2 = cyclicShift.doCyclicShift(funcionArray);
        assertArrayEquals(testArray1, testArray2);
    }
}