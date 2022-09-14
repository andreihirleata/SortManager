package com.sparta.sorter;

import com.sparta.models.sorters.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class BubbleSortTest {
    @Test
    @DisplayName("array swap functionality")
    void arraySwapTest() {
        BubbleSort bubbSort = new BubbleSort();
        int[] arrayToBeSorted = {8, 88, 323 ,7 ,654 ,23423 ,544};
        int[] expectedResult = {7,8,88,323,544,654,23423};
        Assertions.assertArrayEquals(bubbSort.sortArray(arrayToBeSorted), expectedResult);
    }

    @Test
    @DisplayName("does not change the original array")
    void noChangeOriginalArrTest(){
        BubbleSort bubbSort = new BubbleSort();
        int[] arrayToBeSorted = {7,6,5,4,3,2,1};
        int[] arrayCopy = arrayToBeSorted.clone(); /* created clone of original array before being sorted
                                                    - expecting original array to not change after sort */
        bubbSort.sortArray(arrayToBeSorted);
        Assertions.assertArrayEquals(arrayToBeSorted,arrayCopy);
    }

    @Test
    @DisplayName("returns already sorted arrays as they are")
    void alreadySortedArray() {
        BubbleSort bubbSort = new BubbleSort();
        int[] alreadySortedArray = {1,2,3,4,5,6,7,8,9};
        int[] expectedResult = {1,2,3,4,5,6,7,8,9};

        Assertions.assertArrayEquals(bubbSort.sortArray(alreadySortedArray),expectedResult);
    }

    @Test
    @DisplayName("Works with empty arrays")
    void emptyArray() {
        BubbleSort bubbSort = new BubbleSort();
        int arrayToCheck[] = {};
        int resultArray[] = {};
        Assertions.assertArrayEquals(bubbSort.sortArray(arrayToCheck),resultArray);
    }

    @Test
    @DisplayName("Works with single value arrays")
    void singleElementArray(){
        BubbleSort bubbSort = new BubbleSort();
        int arrayToCheck[] = {1};
        int resultArray[] = {1};
        Assertions.assertArrayEquals(bubbSort.sortArray(arrayToCheck),resultArray);

    }

    @Test
    @DisplayName("keeps duplicated values")
    void duplicatedValues() {
        BubbleSort bubbSort = new BubbleSort();
        int arrayToCheck[] = {2,1,1,5,4,4,6,7,6};
        int resultArray[] = {1,1,2,4,4,5,6,6,7};
        Assertions.assertArrayEquals(bubbSort.sortArray(arrayToCheck),resultArray);
    }
}