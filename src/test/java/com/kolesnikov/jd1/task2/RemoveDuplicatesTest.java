package com.kolesnikov.jd1.task2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RemoveDuplicatesTest {

    @Test
    public void doRemoveDuplicates() throws Exception {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] testArray1 = {1, 2, 3, 4, 5, 7};
        int[] functionArray = {1, 2, 3, 1, 4, 1, 1, 2, 5, 7, 3};
        int[] testArray2 = removeDuplicates.doRemoveDuplicates(functionArray);
        assertArrayEquals(testArray1, testArray2);
    }
}