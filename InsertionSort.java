package com.company;

public class InsertionSort {
    public int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int bef = i - 1;
            while ((bef > -1) && (arr[bef] > key)) {
                arr[bef + 1] = arr[bef];
                bef--;
            }
            arr[bef + 1] = key;
        }
        return arr;
    }

}
