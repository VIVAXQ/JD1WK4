package com.kolesnikov.jd1.task3;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeArraysTest {

    @Test
    public void doMergeArrays() throws Exception {
        MergeArrays mergeArrays = new MergeArrays();
        int[] functionArray1 = {1, 2, 3, 4};
        int[] functionArray2 = {3, 2, 1, 5, 7};
        int[] testArray1 = {1, 3, 2, 2, 3, 1, 4, 5, 7};
        int[] testArray2 = mergeArrays.doMergeArrays(functionArray1, functionArray2);
        assertArrayEquals(testArray1, testArray2);
    }
}