package com.kolesnikov.jd1.task4;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class HandlingTwoDimensionalArrayTest {

    @Test
    public void linearize() throws Exception {
        HandlingTwoDimensionalArray handlingTwoDimensionalArray = new HandlingTwoDimensionalArray();
        int[][] functionArray1 = {
                {1, 2, 3},
                {4, 5, 6, 7, 8, 9},
                {8, 9},
        };
        int[] testArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 9};
        int[] testArray2 = handlingTwoDimensionalArray.linearize(functionArray1);
        assertArrayEquals(testArray1, testArray2);
    }
}