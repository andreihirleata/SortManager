package com.sparta.controllers;


import com.sparta.models.sorters.Sorter;
import com.sparta.models.util.CustomErr;

public class SortManager {
    private static final int BUBBLE_CHOICE = 1;
    private static final int MERGE_SORT_CHOICE = 2;
    private static final int BINARY_SORT_CHOICE = 3;

    public static int[] start(int userInput,int[] arr) throws CustomErr {
        SorterTypes choice = null;
        if(userInput == BUBBLE_CHOICE) {
            choice = SorterTypes.Bubble;
        } else if (userInput == MERGE_SORT_CHOICE) {
            choice = SorterTypes.MergeSort;
        } else if (userInput == BINARY_SORT_CHOICE) {
            choice = SorterTypes.BinaryTree;
        } else throw new CustomErr("Invalid input");
        Sorter choiceSorter = SorterFactory.getSorter(choice);
        return choiceSorter.sortArray(arr);
    }
}
