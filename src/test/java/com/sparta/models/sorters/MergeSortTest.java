package com.sparta.models.sorters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class MergeSortTest {
    @Test
    @DisplayName("functionality test")
    public void mergeSortTest() {
        MergeSort mergeSort = new MergeSort();
        int[] testArr = {21, 20, 1, 5, 8, 21, 30};
        int[] expectedResult = {1, 5, 8, 20, 21, 21, 30};
        Assertions.assertArrayEquals(mergeSort.sortArray(testArr),expectedResult);
    }


    @Test
    @DisplayName("returns already sorted arrays as they are")
    void alreadySortedArray() {
        MergeSort mergeSort = new MergeSort();
        int[] alreadySortedArray = {1,2,3,4,5,6,7,8,9};
        int[] expectedResult = {1,2,3,4,5,6,7,8,9};

        Assertions.assertArrayEquals(mergeSort.sortArray(alreadySortedArray),expectedResult);
    }

    @Test
    @DisplayName("Works with empty arrays")
    void emptyArray() {
        MergeSort mergeSort = new MergeSort();
        int[] arrayToCheck = {};
        int[] resultArray = {};
        Assertions.assertArrayEquals(mergeSort.sortArray(arrayToCheck),resultArray);
    }

    @Test
    @DisplayName("Works with single value arrays")
    void singleElementArray(){
        MergeSort mergeSort = new MergeSort();
        int[] arrayToCheck = {1};
        int[] resultArray = {1};
        Assertions.assertArrayEquals(mergeSort.sortArray(arrayToCheck),resultArray);

    }

    @Test
    @DisplayName("keeps duplicated values")
    void duplicatedValues() {
        MergeSort mergeSort = new MergeSort();
        int[] arrayToCheck = {2,1,1,5,4,4,6,7,6};
        int[] resultArray = {1,1,2,4,4,5,6,6,7};
        Assertions.assertArrayEquals(mergeSort.sortArray(arrayToCheck),resultArray);
    }
}
