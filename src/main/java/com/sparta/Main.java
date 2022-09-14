package com.sparta;

import com.sparta.models.util.CustomErr;
import com.sparta.views.DisplayManager;

public class Main {
    public static void main(String[] args) throws CustomErr {
//        int arr[] = { 64,64, 34, 25,25, 12, 22, 11, 90 };
//        BubbleSort bubbleSort = new BubbleSort();
//        System.out.println("Array to be sorted " + Arrays.toString(arr) );
//        System.out.println("\nSort result " + Arrays.toString(bubbleSort.sortArray(arr)));
//
//        MergeSort mergesort = new MergeSort();
//        System.out.println(Arrays.toString(mergesort.sortArray(arr)));

//        BTreeSort bTree = new BTreeSort();
//        bTree.sortArray(arr);
//        System.out.println(Arrays.toString(arr));

//        int[] arr2 = RandArray.generateRandArr(10,500);
//        System.out.println(Arrays.toString(arr2));
//        mergesort.sortArray(arr2);
//        System.out.println(Arrays.toString(arr2));
        DisplayManager.displaySort();
    }
}