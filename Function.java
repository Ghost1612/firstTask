package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Function {

    public void daysOfWeek(int number) {
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

    public void moduleOfVector(double x, double y) {
        double module = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println(module);
    }

    public double convertStringToInt(String txt) {
        try {
            double number = Double.parseDouble(txt);
            return number;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public BigDecimal bigDecimal(BigDecimal x) {
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
}
