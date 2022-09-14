package com.sparta.models.sorters;

public  class BubbleSort implements Sorter {

    @Override
    public int[] sortArray(int[] arrayToSort) {
        if(arrayToSort.length <= 1) return arrayToSort;

        boolean swapped;
        int numToSwap;

        for(int i = 0; i < arrayToSort.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arrayToSort.length - i - 1; j++) {
                if(arrayToSort[j] > arrayToSort[j + 1]) {
                    numToSwap = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = numToSwap;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }


        return arrayToSort;
    }
}
