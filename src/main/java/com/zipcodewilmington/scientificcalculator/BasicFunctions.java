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

    public static String sqrt(double number) {
        number = Math.sqrt(number);
        return Double.toString(number);
    }
    public static String invertSign(double value){
        value = value * -1.0;
        return Double.toString(value);
    }

    }

}


    // Tristan will write methods for basic calculator functions
    // e.g. + - / *

