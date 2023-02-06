package com.company;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        testFunc();

        testIf();

        testLoop();

        testArr();

        int[] arr = new int[]{1, 223, 5, 4, -2333, 0, -637, -3};
        System.out.println(Arrays.toString(bubbleSort(arr)));

        int[] arr2 = new int[]{1, 223, 5, 4, -2333, 0, -637, -3};
        System.out.println(Arrays.toString(insertionSort(arr2)));

        int[] arr3 = new int[]{1, 223, 5, 4, -2333, 0, -637, -3};
        shellSort(arr3);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = new int[]{1, 223, 5, 4, -2333, 0, -637, -3};
        selectionSort(arr4);
        System.out.println(Arrays.toString(arr4));

        int[] arr5 = new int[]{1, 223, 5, 4, -2333, 0, -637, -3};
        int low = 0;
        int high = arr5.length - 1;
        quickSort(arr5, low, high);
        System.out.println(Arrays.toString(arr5));

        int[] arr6 = new int[]{1, 223, 5, 4, -2333, 0, -637, -3};
        mergeSort(arr6, arr6.length);
        System.out.println(Arrays.toString(arr6));

        int[] arr7 = new int[]{1, 223, 5, 4, -2333, 0, -637, -3};
        heapSort(arr7);
        System.out.println(Arrays.toString(arr7));

        BST bst = new BST(arr[0]);
        for(int num : arr) {
            bst.insert(bst.node, num);
        }
        bst.inOrder(bst.node);
        System.out.println();
    }

    public static void method1(int number) {
        switch (number) {
            case (1):
                System.out.println("Monday");
                break;
            case (2):
                System.out.println("Tuesday");
                break;
            case (3):
                System.out.println("Wednesday");
                break;
            case (4):
                System.out.println("Thursday");
                break;
            case (5):
                System.out.println("Friday");
                break;
            case (6):
                System.out.println("Saturday");
                break;
            case (7):
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error!");
                break;

        }
    }

    public static void method2(double x, double y) {
        double module = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println(module);
    }

    public static double method3(String txt) {
        try {
            double number = Double.parseDouble(txt);
            return number;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static BigDecimal method4(BigDecimal x) {
        BigDecimal result = x;
        BigDecimal a;
        BigDecimal b;
        BigDecimal c = new BigDecimal(6);

        a = result.add(x);
        b = result.multiply(x);
        a = a.divide(b);
        b = result.multiply(BigDecimal.valueOf(3.0)).subtract(result.divide(c, RoundingMode.HALF_UP));
        result = a.add(b);
        //(х + х)/ x^2 + ((x * 3) - x/6)
        return result;
    }

    public static double method5(double x, double y) {
        if (x % 2 == 0) {
            return x * y;
        } else {
            return x + y;
        }
    }

    public static void method6(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println(1);
        } else if (x > 0 && y < 0) {
            System.out.println(4);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else {
            System.out.println("center or axis x or axis y");
        }

    }

    public static double method7(double x, double y, double z) {
        double a = 0;
        if (x > 0) {
            a += x;
        }
        if (y > 0) {
            a += y;
        }
        if (z > 0) {
            a += z;
        }
        return a;
    }

    public static void method8(int rating) {
        if (rating <= 20) {
            System.out.println("F");
        } else if (rating <= 40 && rating > 20) {
            System.out.println("E");
        } else if (rating <= 60 && rating > 40) {
            System.out.println("D");
        } else if (rating <= 75 && rating > 60) {
            System.out.println("C");
        } else if (rating <= 90 && rating > 75) {
            System.out.println("B");
        } else if (rating <= 100 & rating > 90) {
            System.out.println("A");
        }

    }

    public static int method9() {
        int x = 0;
        for (int i = 1; i <= 100; i++) {
            x += i;
        }
        return x;
    }

    public static boolean method10(int[] x) {
        boolean result = false;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                result = true;
            }
        }
        return result;
    }

    public static int[] method11(int x) {
        int[] result = new int[x];

        for (int i = 1; i < x; i++) {
            result[i] = i * i;
        }
        return result;
    }

    public static int method12(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static int method13(int x) {
        int result = 0;
        while (x != 0) {
            result += (x % 10);
            x /= 10;
        }
        return result;
    }

    public static void method14(int x) {
        String s = String.valueOf(x);
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }

    public static int[] method15(int[] arr) {
        int c = arr.length % 2;
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length / 2 + i + c];
            arr[arr.length / 2 + i + c] = t;
        }
        return arr;
    }

    public static void method16(int[] arr) {
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

    public static int[] method17(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = t;
        }
        return arr;
    }

    public static int method18(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void method19(int[] arr) {
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

    public static void method20(int[] arr) {
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

    public static void testFunc() {
        method1(1);
        method2(3, 4);
        System.out.println(method3("987l8"));
        BigDecimal x = BigDecimal.valueOf(5);
        System.out.println(method4(x));
    }

    public static void testIf() {
        System.out.println(method5(3, 8));
        method6(90, 90);
        System.out.println(method7(1, -9, 10));
        method8(57);
    }

    public static void testLoop() {
        System.out.println(method9());
        int[] a = new int[]{1, 3, 5, 8};
        System.out.println(method10(a));
        System.out.println(Arrays.toString(method11(5)));
        System.out.println(method12(5));
        System.out.println(method13(123456));
        method14(1234567890);
    }

    public static void testArr() {
        int[] arr = new int[]{1, 3, 5, 6, 7, 8};
        System.out.println("\n" + Arrays.toString(method15(arr)));
        method16(arr);
        int[] arr2 = new int[]{1, 3, 5, 6, 7, 8};
        System.out.println(Arrays.toString(method17(arr2)));
        System.out.println(method18(arr2));
        int[] arr3 = new int[]{1, 3, -6, 6, 7, -8};
        method19(arr3);
        method20(arr3);
    }

    public static int[] bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
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

    public static void shellSort(int arr[]) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > key) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = key;
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void quickSort(int[] array, int low, int high) {
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

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static void mergeSort(int[] arr, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(arr, l, r, mid, n - mid);
    }

    public static void heapify(int arr[], int N, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < N && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < N && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, N, largest);
        }
    }

    public static void heapSort(int arr[]) {
        int N = arr.length;
        for (int i = N / 2 - 1; i >= 0; i--) {
            heapify(arr, N, i);
        }
        for (int i = N - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void treeSort(int[] arr) {


    }
}
class Node{
    int value;
    Node left;
    Node right;
    Node(int value){
        this.value = value;
        left = null;
        right = null;
    }
}
// Class for Binary Search Tree
class BST{
    Node node;
    BST(int value){
        node = new Node(value);
    }
    public Node insert(Node node, int value){
        if(node == null){
            return new Node(value);
        }
        // Move to left for value less than parent node
        if(value < node.value){
            node.left = insert(node.left, value);
        }
        // Move to right for value greater than parent node
        else if(value > node.value){
            node.right = insert(node.right, value);
        }
        return node;
    }

    // For traversing in order
    public void inOrder(Node node){
        if(node != null){
            // recursively traverse left subtree
            inOrder(node.left);
            System.out.print(node.value + " ");
            // recursively traverse right subtree
            inOrder(node.right);
        }
    }
}