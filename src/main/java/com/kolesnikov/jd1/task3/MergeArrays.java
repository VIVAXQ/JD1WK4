package com.kolesnikov.jd1.task3;

import org.apache.commons.lang.ArrayUtils;

public class MergeArrays {

    public int[] doMergeArrays(int[] workingArray1, int[] workingArray2) {
        int[] completeArray = {};
        //  не знаю как корректно объявлять в данном случае, так или через new int[]
        int needfulLenght;
        if (workingArray1.length > workingArray2.length) {
            needfulLenght = workingArray1.length;
        } else {
            needfulLenght = workingArray2.length;
        }
        for (int i = 0; i < needfulLenght; i++) {
            if (i < workingArray1.length) {
                completeArray = ArrayUtils.add(completeArray, workingArray1[i]);
            }
            if (i < workingArray2.length) {
                completeArray = ArrayUtils.add(completeArray, workingArray2[i]);
            }
        }
        return completeArray;
    }
}
