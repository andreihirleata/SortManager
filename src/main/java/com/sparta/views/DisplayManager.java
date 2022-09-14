package com.sparta.views;

import com.sparta.controllers.SortManager;
import com.sparta.models.util.CustomErr;
import com.sparta.models.util.RandArray;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayManager {
    public static void displaySort() throws CustomErr {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the length of the array to generate: ");
        int arrayLength = sc.nextInt();
        System.out.println("Please input the upper limit for the elements of the array: ");
        int bound = sc.nextInt();
        int[] array = RandArray.generateRandArr(arrayLength,bound);
        int[] testArray = {1,3,2,2,1,6,7,44,32,22};
        System.out.println("Please select one of the following options to sort the array: ");
        System.out.println("1 Bubble sort");
        System.out.println("2 Merge sort");
        System.out.println("3 Binary tree sort");
        int choice = sc.nextInt();
        System.out.println(Arrays.toString(SortManager.start(choice, array)));
    }
}
