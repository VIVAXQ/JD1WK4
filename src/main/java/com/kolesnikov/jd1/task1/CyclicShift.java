package com.kolesnikov.jd1.task1;

public class CyclicShift {

    public int[] doCyclicShift(int[] workingArray) {
        int tempLast = workingArray[workingArray.length - 1];
        for (int i = workingArray.length - 1; i > 0; i--) {
            workingArray[i] = workingArray[i - 1];
        }
        workingArray[0] = tempLast;
        return workingArray;
    }
}
