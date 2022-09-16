package com.sparta.models.sorters;


import java.util.Arrays;

import static com.sparta.models.sorters.MergeSort.logger;

public class BTreeSort implements Sorter {
    void insert(Node root, int data) {
        if (root.data >= data) {
            if (root.left == null) {
                root.left = new Node(data);
            } else {
                insert(root.left, data);
            }
        } else {
            if (root.right == null) {
                root.right = new Node(data);
            } else {
                insert(root.right, data);
            }
        }
    }


    public Node createBTreeFromArray(int[] arr) {
        Node root = new Node(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            insert(root, arr[i]);
        }
        return root;
    }

    public int inorderArr(Node root,int[] arr,int index) {
        if (root != null) {
            if (root.left != null) {
                index = inorderArr(root.left, arr, index);
            }
            arr[index++] = root.data;
            if (root.right != null) {
                index = inorderArr(root.right, arr, index);
            }
        }
        return index;
    }
    @Override
    public int[] sortArray(int[] arrayToSort) {
        logger.trace("Logging start of BTreeSort" + Arrays.toString(arrayToSort));
//        long startTime = System.nanoTime();
        if (arrayToSort.length == 0) return new int[0];
        inorderArr(createBTreeFromArray(arrayToSort),arrayToSort,0);
//        long endTime = System.nanoTime();
//        System.out.println("It took " + (endTime - startTime) / 1_000_000_000.00000 + " seconds to execute");
        logger.trace("Logging end of BTreeSort" + Arrays.toString(arrayToSort));
        return arrayToSort;
    }
}
