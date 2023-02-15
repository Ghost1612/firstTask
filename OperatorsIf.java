package com.company;

public class OperatorsIf {
    public double evenOrOdd(double x, double y) {
        if (x % 2 == 0) {
            return x * y;
        } else {
            return x + y;
        }
    }

    public void coordinateQuarter(int x, int y) {
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

    public double sumPositiveNumbers(double x, double y, double z) {
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

    public void ratingStudent(int rating) {
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
}
