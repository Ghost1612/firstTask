package com.company;

public class Loop {

    public static int sumTo100() {
        int x = 0;
        for (int i = 1; i <= 100; i++) {
            x += i;
        }
        return x;
    }

    public boolean evenNumberInArray(int[] x) {
        boolean result = false;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                result = true;
            }
        }
        return result;
    }

    public int[] squareOfNumbersSmallerThan(int x) {
        int[] result = new int[x];

        for (int i = 1; i < x; i++) {
            result[i] = i * i;
        }
        return result;
    }

    public int factorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public int sumODigitInNumber(int x) {
        int result = 0;
        while (x != 0) {
            result += (x % 10);
            x /= 10;
        }
        return result;
    }

    public void mirrorNumber(int x) {
        String s = String.valueOf(x);
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
