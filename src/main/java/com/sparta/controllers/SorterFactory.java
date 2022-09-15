package com.sparta.controllers;

import com.sparta.models.sorters.*;

public class SorterFactory {
    public static Sorter getSorter(SorterTypes sorterType) {
        return switch(sorterType) {
            case Bubble -> new BubbleSort();
            case MergeSort -> new MergeSort();
            case BinaryTree -> new BTreeSort();
        };
    }
}
