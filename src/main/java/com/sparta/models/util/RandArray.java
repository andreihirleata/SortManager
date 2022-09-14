package com.sparta.models.util;

import java.util.Random;

public class RandArray {
    public static  int[] generateRandArr(int length,int bound) {
        int[] arr = new int[length];
        Random rand = new Random();
        for(int i = 0; i < length; i++) {
            arr[i] = rand.nextInt(bound);
        }
        return arr;
    }
}
