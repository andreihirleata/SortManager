package com.sparta.models.sorters;

public  class BubbleSort implements Sorter {

    @Override
    public int[] sortArray(int[] arrayToSort) {
        if(arrayToSort.length <= 1) return arrayToSort;
        int[] arrayCopy = arrayToSort.clone();
        int duplicateCounter = 0;

        boolean swapped;
        int numToSwap;

        for(int i = 0; i < arrayCopy.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arrayCopy.length - i - 1; j++) {
                if(arrayCopy[j] > arrayCopy[j + 1]) {
                    numToSwap = arrayCopy[j];
                    arrayCopy[j] = arrayCopy[j+1];
                    arrayCopy[j+1] = numToSwap;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }


        return arrayCopy;
    }
}
