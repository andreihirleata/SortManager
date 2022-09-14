package com.sparta.models.sorters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class BTreeSortTest {
    @Test
    @DisplayName("array sort functionality")
    void arraySwapTest() {
        BTreeSort bTreeSort = new BTreeSort();
        int[] arrayToBeSorted = {8, 88, 323 ,7 ,654 ,23423 ,544};
        int[] expectedResult = {7,8,88,323,544,654,23423};
        Assertions.assertArrayEquals(bTreeSort.sortArray(arrayToBeSorted), expectedResult);
    }

    @Test
    @DisplayName("returns already sorted arrays as they are")
    void alreadySortedArray() {
        BTreeSort bTreeSort = new BTreeSort();
        int[] alreadySortedArray = {1,2,3,4,5,6,7,8,9};
        int[] expectedResult = {1,2,3,4,5,6,7,8,9};

        Assertions.assertArrayEquals(bTreeSort.sortArray(alreadySortedArray),expectedResult);
    }

    @Test
    @DisplayName("Works with empty arrays")
    void emptyArray() {
        BTreeSort bTreeSort = new BTreeSort();
        int[] arrayToCheck = {};
        int[] resultArray = {};
        Assertions.assertArrayEquals(bTreeSort.sortArray(arrayToCheck),resultArray);
    }

    @Test
    @DisplayName("Works with single value arrays")
    void singleElementArray(){
        BTreeSort bTreeSort = new BTreeSort();
        int[] arrayToCheck = {1};
        int[] resultArray = {1};
        Assertions.assertArrayEquals(bTreeSort.sortArray(arrayToCheck),resultArray);

    }

    @Test
    @DisplayName("keeps duplicated values")
    void duplicatedValues() {
        BTreeSort bTreeSort = new BTreeSort();
        int[] arrayToCheck = {2,1,1,5,4,4,6,7,6};
        int[] resultArray = {1,1,2,4,4,5,6,6,7};
        Assertions.assertArrayEquals(bTreeSort.sortArray(arrayToCheck),resultArray);
    }
}
