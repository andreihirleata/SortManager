package com.sparta.models.sorters;


public class MergeSort implements Sorter {

    public static void merge(int[] arr, int[] leftArray, int[] rightArray, int left, int right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int mergedArrayPosition = 0;

        while (leftIndex < left && rightIndex < right) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                arr[mergedArrayPosition++] = leftArray[leftIndex++];
            } else  {
                arr[mergedArrayPosition++] = rightArray[rightIndex++];
            }
        }

        while (leftIndex < left) {

            arr[mergedArrayPosition++] = leftArray[leftIndex++];
        }

        while (rightIndex < right) {

            arr[mergedArrayPosition++] = rightArray[rightIndex++];
        }

    }

    public static void mergeSort(int[] arr, int arrayLength) {
        if (arrayLength < 2) {
            return;
        }
        int mid = arrayLength / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[arrayLength - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = arr[i];
        }
        for (int i = mid; i < arrayLength; i++) {
            rightArray[i - mid] = arr[i];
        }
        mergeSort(leftArray, mid);
        mergeSort(rightArray, arrayLength - mid);

        merge(arr, leftArray, rightArray, mid, arrayLength - mid);
    }
    @Override
    public int[] sortArray(int[] arrayToSort) {
        mergeSort(arrayToSort,arrayToSort.length);
        return arrayToSort;
    }
}
