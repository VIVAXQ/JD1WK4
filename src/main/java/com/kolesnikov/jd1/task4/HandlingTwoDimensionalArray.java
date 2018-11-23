package com.kolesnikov.jd1.task4;

import org.apache.commons.lang.ArrayUtils;

public class HandlingTwoDimensionalArray {

    public int[] linearize(int[][] workingArray) {
        int[] completeArray = {};
        for (int i = 0; i < workingArray.length; i++) {
            for (int j = 0; j < workingArray[i].length; j++) {
                completeArray = ArrayUtils.add(completeArray, workingArray[i][j]);
            }
        }
        return completeArray;
    }
}
