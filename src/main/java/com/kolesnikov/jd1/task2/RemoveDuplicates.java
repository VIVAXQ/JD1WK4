package com.kolesnikov.jd1.task2;

import org.apache.commons.lang.ArrayUtils;

public class RemoveDuplicates {

    public int[] doRemoveDuplicates(int[] workingArray) {
        for (int i = 0; i < workingArray.length; i++) {
            for (int j = 0; j < workingArray.length; j++) {
                if ((!(i == j)) & (workingArray[i] == workingArray[j])) {
                    workingArray = ArrayUtils.remove(workingArray, j);
                    j -= 1;
                }
            }
        }
        return workingArray;
    }
}
