package com.sparta.models.util;

import com.sparta.models.sorters.Sorter;

public class ExecuteTime {
    public static int[] displayTimeToExecute(Sorter sorter,int[] arr) {
        long startTime = System.nanoTime();
        int[] sortedArray = sorter.sortArray(arr);
        long endTime = System.nanoTime();
        System.out.println("It took " + (endTime - startTime) / 1000000.00000 + " miliseconds to execute");
        return sortedArray;
    }
}
