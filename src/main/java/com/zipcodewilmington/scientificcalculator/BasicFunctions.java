package com.zipcodewilmington.scientificcalculator;

public class BasicFunctions {
    public static void main(String[] args) {
    }

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
        double x = 0;
        return Math.sqrt(x);
    }
    public static String invertSign(Double value){
        value = value * -1.0;
        return Double.toString(value);
    }
}


    // Tristan will write methods for basic calculator functions
    // e.g. + - / *
