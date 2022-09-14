package com.sparta.controllers;

import com.sparta.models.sorters.BTreeSort;
import com.sparta.models.sorters.BubbleSort;
import com.sparta.models.sorters.MergeSort;
import com.sparta.models.sorters.Sorter;

public class SorterFactory {
    public static Sorter getSorter(SorterTypes sorterType) {
        Sorter sorter = switch(sorterType) {
            case Bubble -> new BubbleSort();
            case MergeSort -> new MergeSort();
            case BinaryTree -> new BTreeSort();
            default -> null;
        };
        return sorter;
    }
}
