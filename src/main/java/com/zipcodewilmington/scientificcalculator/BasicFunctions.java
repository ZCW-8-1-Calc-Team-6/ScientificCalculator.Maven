package com.zipcodewilmington.scientificcalculator;

public class BasicFunctions {

    public static String add(double x, double y) {
        double value = x + y;
        return Double.toString(value);
    }

    public static String multiply(double x, double y) {
        double value = x * y;
        return Double.toString(value);
    }

    public static String divide(double x, double y) {
        double value = x / y;
        return Double.toString(value);
    }

    public static String subtract(double x, double y) {
        double value = x - y;
        return Double.toString(value);
    }

    public static double sqrt(double number) {
        return Math.sqrt(number);
    }

    public static String invertSign(double value) {
        value = value * -1.0;
        return Double.parseDouble(Double.toString(value));
    }

    public static double Pow(double num, int exp) {
        double result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        return result;
    }

    public static double sqrt(double, number) {
        double x = 0;
        double answer = Math.sqrt(Math.pow(x, 2));
    }
}









    // Tristan will write methods for basic calculator functions
    // e.g. + - / *

