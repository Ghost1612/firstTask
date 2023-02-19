package com.company;

import com.company.Arrays.Array;
import com.company.Cycles.Loop;
import com.company.Functions.Function;
import com.company.OpratorsIf.OperatorsIf;
import com.company.SortingArrays.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Controller {

    private Scanner scanner = new Scanner(System.in);

    public void getMain(){
        Function function = new Function();
        OperatorsIf operators = new OperatorsIf();
        Loop loop = new Loop();
        Array arrays = new Array();

        PrintArray printArray = new PrintArray();

        while(true){
            System.out.println("""
                    Enter your number:
                    1 - Functions
                    2 - Operators If
                    3 - Cycles 
                    4 - Arrays
                    5 - check array sorting""");
            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("""
                            It`s functions, then choose method:
                            1 - Day of the week by his number 
                            2 - Module of vector by coordinates
                            3 - Converting string to int
                            4 - How to work BigDecimal """);
                    int chooseInFunc = scanner.nextInt();
                    switch (chooseInFunc) {
                        case 1:
                            System.out.println("You`re chose 1 - day of the week by his number ");
                            System.out.println("Enter your number:");
                            int dayOfWeek = scanner.nextInt();
                            function.daysOfWeek(dayOfWeek);
                            break;
                        case 2:
                            System.out.println("You`re chose 2 - module of vector by coordinates ");
                            System.out.println("Enter coordinates: ");
                            int x = scanner.nextInt();
                            int y = scanner.nextInt();
                            function.moduleOfVector(x, y);
                            break;
                        case 3:
                            System.out.println("You`re chose 3 - converting string to int ");
                            System.out.println("Enter your number: ");
                            String number = scanner.next();
                            System.out.println(function.convertStringToInt(number));
                            break;
                        case 4:
                            System.out.println("You`re chose 4 - how to work BigDecimal  ");
                            System.out.println("Enter your number: ");
                            BigDecimal numberBigDec = scanner.nextBigDecimal();
                            System.out.println(function.bigDecimal(numberBigDec));
                            break;
                        default:
                            System.out.println("Incorrect Number! Choose from 1 to 4");
                    }
                    break;
                case 2:
                    System.out.println("""
                            It`s operators if, then choose method:
                            1 - If the first number is even, then return their product, if not then the sum 
                            2 - Return the number of the coordinate quarter in which the number is located
                            3 - Sum positive numbers from 3 entered 
                            4 - Rating student """);
                    int chooseInOperatorsIf = scanner.nextInt();
                    switch (chooseInOperatorsIf) {
                        case 1:
                            System.out.println("You`re chose 1 - If the first number is even, then return their product, if not then the sum  ");
                            System.out.println("Enter two numbers:");

                            int evenOrOddNumber1 = scanner.nextInt();
                            int evenOrOddNumber2 = scanner.nextInt();

                            System.out.println(operators.evenOrOdd(evenOrOddNumber1, evenOrOddNumber2));
                            break;
                        case 2:
                            System.out.println("You`re chose 2 - Return the number of the coordinate quarter in which the number is located ");
                            System.out.println("Enter coordinates of the number:");
                            int x = scanner.nextInt();
                            int y = scanner.nextInt();
                            operators.coordinateQuarter(x, y);
                            break;
                        case 3:
                            System.out.println("You`re chose 3 - Sum positive numbers from 3 entered ");
                            System.out.println("Enter three numbers:");
                            int number1 = scanner.nextInt();
                            int number2 = scanner. nextInt();
                            int number3 = scanner.nextInt();
                            System.out.println(operators.sumPositiveNumbers(number1, number2, number3));
                            break;
                        case 4:
                            System.out.println("You`re chose 4 - Rating student ");
                            System.out.println("Enter rating of the student from 1 to 100:");
                            int rating = scanner.nextInt();
                            operators.ratingStudent(rating);
                            break;
                        default:
                            System.out.println("Incorrect Number! Choose from 1 to 4");
                    }
                    break;
                case 3:
                    System.out.println("""
                            It`s cycles , then choose method:
                            1 - Sum from 1 to 100 
                            2 - Except even number in array
                            3 - Squares of all numbers that are less than number
                            4 - Factorial of a number 
                            5 - Sum of all digits in a number
                            6 - Mirror number""");
                    int chooseInCycles = scanner.nextInt();
                    switch (chooseInCycles) {
                        case 1:
                            System.out.println("You`re chose 1 -  Sum from 1 to 10");
                            System.out.println(loop.sumToHundred());
                            break;
                        case 2:
                            System.out.println("You`re chose 2 - Except even number in array");
                            System.out.println("Insert array length and then - elements:");
                            int size = scanner.nextInt();
                            int[] array = new int[size];
                            for (int i = 0; i < size; i++) {
                                array[i] = scanner.nextInt();
                            }
                            System.out.println(loop.evenNumberInArray(array));
                            break;
                        case 3:
                            System.out.println("You`re chose 3 - Squares of all numbers that are less than number");
                            System.out.println("Insert your number");
                            int number = scanner.nextInt();
                            System.out.println(Arrays.toString(loop.squareOfNumbersSmallerThan(number)));
                            break;
                        case 4:
                            System.out.println("You`re chose 4 - Factorial of a number");
                            System.out.println("Insert your number");
                            int numberToDigitFactorial = scanner.nextInt();
                            System.out.println(loop.factorial(numberToDigitFactorial));
                            break;
                        case 5:
                            System.out.println("You`re chose 5 - Sum of all digits in a number");
                            System.out.println("Enter a number: ");
                            int numberToSumDigitsInNumber = scanner.nextInt();
                            System.out.println(loop.sumDigitInNumber(numberToSumDigitsInNumber));
                            break;
                        case 6:
                            System.out.println("You`re chose 6 - Mirror number");
                            System.out.println("Enter a number:");
                            int numberMirror = scanner.nextInt();
                            loop.mirrorNumber(numberMirror);
                            break;
                        default:
                            System.out.println("Incorrect Number! Choose from 1 to 6");
                    }
                    break;
                case 4:
                    System.out.println("""
                            It`s arrays , then choose method:
                            1 - Swap the first and second half in array
                            2 - Sum even numbers in array
                            3 - Expand array
                            4 - Sum numbers in odd indexes in array
                            5 - Maximum and minimum element in array
                            6 - Index maximum and minimum elements in array""");
                    int chooseInArray = scanner.nextInt();
                    switch (chooseInArray) {
                        case 1:
                            System.out.println("You`re chose 1 - Swap the first and second half in array");
                            System.out.println("Insert array length and then - elements:");
                            int sizeSwap = scanner.nextInt();
                            int[] arraySwap = new int[sizeSwap];
                            for (int i = 0; i < sizeSwap; i++) {
                                arraySwap[i] = scanner.nextInt();
                            }
                            System.out.println(Arrays.toString(arrays.swapFirstSecondHalf(arraySwap)));
                            break;
                        case 2:
                            System.out.println("You`re chose 2 - Sum even numbers in array");
                            System.out.println("Insert array length and then - elements:");
                            int sizeSumEven = scanner.nextInt();
                            int[] arraySumEven = new int[sizeSumEven];
                            for (int i = 0; i < sizeSumEven; i++) {
                                arraySumEven[i] = scanner.nextInt();
                            }
                            arrays.sumEvenNumbers(arraySumEven);
                            break;
                        case 3:
                            System.out.println("You`re chose 3 - Expand array");
                            System.out.println("Insert array length and then - elements:");
                            int sizeExpand = scanner.nextInt();
                            int[] arrayExpand = new int[sizeExpand];
                            for (int i = 0; i < sizeExpand; i++) {
                                arrayExpand[i] = scanner.nextInt();
                            }
                            System.out.println(Arrays.toString(arrays.expandedArray(arrayExpand)));
                            break;
                        case 4:
                            System.out.println("You`re chose 4 - Sum odd numbers in array");
                            System.out.println("Insert array length and then - elements:");
                            int sizeSumInOddIndex = scanner.nextInt();
                            int[] arraySumInOddIndex = new int[sizeSumInOddIndex];
                            for (int i = 0; i < sizeSumInOddIndex; i++) {
                                arraySumInOddIndex[i] = scanner.nextInt();
                            }
                            System.out.println(arrays.sumNumbersInOddIndex(arraySumInOddIndex));
                            break;
                        case 5:
                            System.out.println("You`re chose 5 - Maximum and minimum element in array");
                            System.out.println("Insert array length and then - elements:");
                            int sizeMaxAndMin= scanner.nextInt();
                            int[] arrayMaxAndMin = new int[sizeMaxAndMin];
                            for (int i = 0; i < sizeMaxAndMin; i++) {
                                arrayMaxAndMin[i] = scanner.nextInt();
                            }
                            arrays.MaximumAndMinimum(arrayMaxAndMin);
                            break;
                        case 6:
                            System.out.println("You`re chose 6 - Index maximum and minimum elements in array");
                            System.out.println("Insert array length and then - elements:");
                            int sizeMaxAndMinIndex = scanner.nextInt();
                            int[] arrayMaxAndMinIndex = new int[sizeMaxAndMinIndex];
                            for (int i = 0; i < sizeMaxAndMinIndex; i++) {
                                arrayMaxAndMinIndex[i] = scanner.nextInt();
                            }
                            arrays.indexMaximumAndMinimum(arrayMaxAndMinIndex);
                            break;
                        default:
                            System.out.println("Incorrect Number! Choose from 1 to 6");
                    }
                    break;
                case 5:
                    System.out.println("""
                            It`s check array sorting, then choose which one:
                            1 - Bubble Sort
                            2 - Insertion Sort
                            3 - Shell sort
                            4 - Selection Sort
                            5 - Quick Sort
                            6 - Merge Sort
                            7 - Heap Sort""");
                    int chooseSorting = scanner.nextInt();
                    switch (chooseSorting) {
                        case 1:
                            int[] unsortedArray1;
                            unsortedArray1 = new int[1000];
                            Random generator1 = new Random();
                            for(int i=0; i<1000; i++) unsortedArray1[i] = (generator1.nextInt(1000)+1);

                            BubbleSort bubble = new BubbleSort();

                            System.out.println("Bubble sort");
                            System.out.println("Unsorted array: ");
                            printArray.print(unsortedArray1);
                            System.out.println("Sorted array: ");

                            long start1 = System.nanoTime();
                            bubble.bubbleSort(unsortedArray1);
                            long end1 = System.nanoTime();
                            long time1 = TimeUnit.MILLISECONDS.convert(end1 - start1, TimeUnit.NANOSECONDS);

                            printArray.print(unsortedArray1);
                            System.out.println("Time (milliseconds) = " + time1);
                            break;
                        case 2:
                            int[] unsortedArray2;
                            unsortedArray2 = new int[1000];
                            Random generator2 = new Random();
                            for(int i=0; i<1000; i++) unsortedArray2[i] = (generator2.nextInt(1000)+1);

                            InsertionSort insertionSort = new InsertionSort();
                            System.out.println("Insertion sort");
                            System.out.println("Unsorted array: ");
                            printArray.print(unsortedArray2);
                            System.out.println("Sorted array: ");

                            long start2 = System.nanoTime();
                            insertionSort.insertionSort(unsortedArray2);
                            long end2 = System.nanoTime();
                            long time2 = TimeUnit.MILLISECONDS.convert(end2 - start2, TimeUnit.NANOSECONDS);

                            printArray.print(unsortedArray2);
                            System.out.println("Time (milliseconds) = " + time2);
                            break;
                        case 3:
                            int[] unsortedArray3;
                            unsortedArray3 = new int[1000];
                            Random generator3 = new Random();
                            for(int i=0; i<1000; i++) unsortedArray3[i] = (generator3.nextInt(1000)+1);

                            ShellSort shell = new ShellSort();
                            System.out.println("Shell sort");
                            System.out.println("Unsorted array: ");
                            printArray.print(unsortedArray3);
                            System.out.println("Sorted array: ");

                            long start3 = System.nanoTime();
                            shell.shellSort(unsortedArray3);
                            long end3 = System.nanoTime();
                            long time3 = TimeUnit.MILLISECONDS.convert(end3 - start3, TimeUnit.NANOSECONDS);

                            printArray.print(unsortedArray3);
                            System.out.println("Time (milliseconds) = " + time3);
                            break;
                        case 4:
                            int[] unsortedArray4;
                            unsortedArray4 = new int[1000];
                            Random generator4 = new Random();
                            for(int i=0; i<1000; i++) unsortedArray4[i] = (generator4.nextInt(1000)+1);
                            SelectionSort selec = new SelectionSort();

                            System.out.println("Selection sort");
                            System.out.println("Unsorted array: ");
                            printArray.print(unsortedArray4);
                            System.out.println("Sorted array: ");

                            long start4 = System.nanoTime();
                            selec.selectionSort(unsortedArray4);
                            long end4 = System.nanoTime();
                            long time4 = TimeUnit.MILLISECONDS.convert(end4 - start4, TimeUnit.NANOSECONDS);
                            printArray.print(unsortedArray4);
                            System.out.println("Time (milliseconds) = " + time4);
                            break;
                        case 5:
                            int[] unsortedArray5;
                            unsortedArray5 = new int[1000];
                            Random generator5 = new Random();
                            for(int i=0; i<1000; i++) unsortedArray5[i] = (generator5.nextInt(1000)+1);
                            QuickSort quick = new QuickSort();

                            int low = 0;
                            int high = unsortedArray5.length - 1;
                            System.out.println("Quick sort");
                            System.out.println("Unsorted array: ");
                            printArray.print(unsortedArray5);
                            System.out.println("Sorted array: ");

                            long start5 = System.nanoTime();
                            quick.quickSort(unsortedArray5, low, high);
                            long end5 = System.nanoTime();
                            long time5 = TimeUnit.MILLISECONDS.convert(end5 - start5, TimeUnit.NANOSECONDS);
                            printArray.print(unsortedArray5);
                            System.out.println("Time (milliseconds) = " + time5);
                            break;
                        case 6:
                            int[] unsortedArray6;
                            unsortedArray6 = new int[1000];
                            Random generator6 = new Random();
                            for(int i=0; i<1000; i++) unsortedArray6[i] = (generator6.nextInt(1000)+1);
                            MergeSort merge = new MergeSort();

                            System.out.println("Merge sort");
                            System.out.println("Unsorted array: ");
                            printArray.print(unsortedArray6);
                            System.out.println("Sorted array: ");

                            long start6 = System.nanoTime();
                            merge.mergeSort(unsortedArray6, unsortedArray6.length);
                            long end6 = System.nanoTime();
                            long time6 = TimeUnit.MILLISECONDS.convert(end6 - start6, TimeUnit.NANOSECONDS);
                            printArray.print(unsortedArray6);
                            System.out.println("Time (milliseconds) = " + time6);
                            break;
                        case 7:
                            int[] unsortedArray7;
                            unsortedArray7 = new int[1000];
                            Random generator7 = new Random();
                            for(int i=0; i<1000; i++) unsortedArray7[i] = (generator7.nextInt(1000)+1);                            HeapSort heap = new HeapSort();

                            System.out.println("Heap sort");
                            System.out.println("Unsorted array: ");
                            printArray.print(unsortedArray7);
                            System.out.println("Sorted array: ");

                            long start7 = System.nanoTime();
                            heap.heapSort(unsortedArray7);
                            long end7 = System.nanoTime();
                            long time7 = TimeUnit.MILLISECONDS.convert(end7 - start7, TimeUnit.NANOSECONDS);
                            printArray.print(unsortedArray7);
                            System.out.println("Time (milliseconds) = " + time7);
                            break;
                        default:
                            System.out.println("Incorrect Number! Choose from 1 to 7");
                    }
                    break;
                default:
                    System.out.println("Incorrect Number! Choose from 1 to 6");
            }

        }
    }
}
