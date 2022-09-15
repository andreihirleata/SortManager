package com.sparta.controllers;


import com.sparta.models.sorters.Sorter;
import com.sparta.models.sorters.SorterTypes;
import com.sparta.models.util.ExecuteTime;

public class SortManager {
    private static final int BUBBLE_CHOICE = 1;
    private static final int MERGE_SORT_CHOICE = 2;
    private static final int BINARY_SORT_CHOICE = 3;

    public static int[] sortChoice(int userInput, int[] arr) {
        if (userInput == BUBBLE_CHOICE) {
            Sorter choiceSorter = SorterFactory.getSorter(SorterTypes.Bubble);
            return ExecuteTime.displayTimeToExecute(choiceSorter,arr);
        } else if (userInput == MERGE_SORT_CHOICE) {
            Sorter choiceSorter = SorterFactory.getSorter(SorterTypes.MergeSort);
            return ExecuteTime.displayTimeToExecute(choiceSorter,arr);
        } else if (userInput == BINARY_SORT_CHOICE) {
            Sorter choiceSorter = SorterFactory.getSorter(SorterTypes.BinaryTree);
            return ExecuteTime.displayTimeToExecute(choiceSorter,arr);
        }
        Sorter choiceSorter = SorterFactory.getSorter(SorterTypes.Bubble);
        System.out.println("Input Error - Defaulted to Bubble Sort");
        return ExecuteTime.displayTimeToExecute(choiceSorter,arr);
    }

}
