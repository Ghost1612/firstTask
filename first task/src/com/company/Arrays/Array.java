package com.company.Arrays;

public class Array {
    public int[] swapFirstSecondHalf(int[] arr) {
        int c = arr.length % 2;
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length / 2 + i + c];
            arr[arr.length / 2 + i + c] = t;
        }
        return arr;
    }

    public void sumEvenNumbers(int[] arr) {
        int nums = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                nums += 1;
                sum += arr[i];
            }
        }
        System.out.println("number of even: " + nums + "\n" + "sum of even: " + sum);
    }

    public int[] expandedArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = t;
        }
        return arr;
    }

    public int sumNumbersInOddIndex(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public void MaximumAndMinimum(int[] arr) {
        int min = arr[0];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min: " + min + " max: " + max);
    }

    public void indexMaximumAndMinimum(int[] arr) {
        int min = arr[0];
        int max = 0;
        int indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = i;
            }
            if (arr[i] < min) {
                indexMin = i;
            }
        }
        System.out.println("index min: " + indexMin + " index max: " + max);
    }
}
