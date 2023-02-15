package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Main {

    public void main(String[] args) {

        testFunc();

        testIf();

        testLoop();

        testArr();

        BubbleSort bubble = new BubbleSort();
        int[] arr = new int[]{1, 223, 5, 4, -2333, 0, -637, -3};
        System.out.println(Arrays.toString(bubble.bubbleSort(arr)));

        InsertionSort ins = new InsertionSort();
        int[] arr2 = new int[]{1, 223, 5, 4, -2333, 0, -637, -3};
        System.out.println(Arrays.toString(ins.insertionSort(arr2)));

        ShellSort shell = new ShellSort();
        int[] arr3 = new int[]{1, 223, 5, 4, -2333, 0, -637, -3};
        shell.shellSort(arr3);
        System.out.println(Arrays.toString(arr3));

        SelectionSort selec = new SelectionSort();
        int[] arr4 = new int[]{1, 223, 5, 4, -2333, 0, -637, -3};
        selec.selectionSort(arr4);
        System.out.println(Arrays.toString(arr4));

        QuickSort quick = new QuickSort();
        int[] arr5 = new int[]{1, 223, 5, 4, -2333, 0, -637, -3};
        int low = 0;
        int high = arr5.length - 1;
        quick.quickSort(arr5, low, high);
        System.out.println(Arrays.toString(arr5));

        MergeSort merge = new MergeSort();
        int[] arr6 = new int[]{1, 223, 5, 4, -2333, 0, -637, -3};
        merge.mergeSort(arr6, arr6.length);
        System.out.println(Arrays.toString(arr6));

        HeapSort heap = new HeapSort();
        int[] arr7 = new int[]{1, 223, 5, 4, -2333, 0, -637, -3};
        heap.heapSort(arr7);
        System.out.println(Arrays.toString(arr7));

        BST bst = new BST(arr[0]);
        for(int num : arr) {
            bst.insert(bst.node, num);
        }
        bst.inOrder(bst.node);
        System.out.println();
    }




    public void testFunc() {
        Function func = new Function();
        func.daysOfWeek(1);
        func.moduleOfVector(3, 4);
        System.out.println(func.convertStringToInt("987l8"));
        BigDecimal x = BigDecimal.valueOf(5);
        System.out.println(func.bigDecimal(x));
    }

    public static void testIf() {
        OperatorsIf opIf = new OperatorsIf();
        System.out.println(opIf.evenOrOdd(3, 8));
        opIf.coordinateQuarter(90, 90);
        System.out.println(opIf.sumPositiveNumbers(1, -9, 10));
        opIf.ratingStudent(57);
    }

    public static void testLoop() {
        Loop loop = new Loop();
        System.out.println(loop.sumTo100());
        int[] a = new int[]{1, 3, 5, 8};
        System.out.println(loop.evenNumberInArray(a));
        System.out.println(Arrays.toString(loop.squareOfNumbersSmallerThan(5)));
        System.out.println(loop.factorial(5));
        System.out.println(loop.sumODigitInNumber(123456));
        loop.mirrorNumber(1234567890);
    }

    public static void testArr() {
        Array arrr = new Array();
        int[] arr = new int[]{1, 3, 5, 6, 7, 8};
        System.out.println("\n" + Arrays.toString(arrr.swapFirstSecondHalf(arr)));
        arrr.sumEvenNumbers(arr);
        int[] arr2 = new int[]{1, 3, 5, 6, 7, 8};
        System.out.println(Arrays.toString(arrr.expandedArray(arr2)));
        System.out.println(arrr.sumNumbersInOddIndex(arr2));
        int[] arr3 = new int[]{1, 3, -6, 6, 7, -8};
        arrr.MaximumAndMinimum(arr3);
        arrr.indexMaximumAndMinimum(arr3);
    }

}


