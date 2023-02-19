package com.company.SortingArrays;

public class QuickSort {
    public void quickSort(int[] array, int low, int high) {
        int middle = low + (high - low) / 2;
        int mid = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < mid) {
                i++;
            }

            while (array[j] > mid) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

}
