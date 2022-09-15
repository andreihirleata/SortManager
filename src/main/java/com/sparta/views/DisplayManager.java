package com.sparta.views;

import com.sparta.controllers.SortManager;
import com.sparta.models.util.InputProcessor;
import com.sparta.models.util.RandArray;

import java.util.Arrays;


public class DisplayManager {
    public static void displaySort()  {
        int arrayLength;
        int bound;
        int sortChoice;

        arrayLength = InputProcessor.processInt("Please input the length of the array to generate (max size = 5000) : ", 5000);
        bound = InputProcessor.processInt("Please input the upper limit for the elements of the array : ", Integer.MAX_VALUE);
        int[] array = RandArray.generateRandArr(arrayLength, bound);
        System.out.println("Your randomly generated array is: \n" + Arrays.toString(array) + "\n");
        sortChoice = InputProcessor.processInt(""" 
                        Please select one of the following options to sort the array:
                        1 Bubble sort
                        2 Merge sort
                        3 Binary tree sort
                        """
                , 3);
        System.out.println(Arrays.toString(SortManager.sortChoice(sortChoice, array)));


    }
}
