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
        if (y == 0.0) {
            return "Error";
        }
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
        return (Double.toString(value));
    }

    public static String pow(double x, double y) {
        return Double.toString(Math.pow(x, y));
    }

    public static double square(double value) {
        return value * value;
    }

    public static double inverse (double value) {
        return 1.0 / value;
    }
}


