package com.zipcodewilmington.scientificcalculator;

public class ScientificFunctions {
    // Ryan adds methods for scientific functions
    // e.g. sin cos etc.

    public static double sin(double x, String units) {
        if (units.equals("degrees")) {
            return Math.sin(Math.toRadians(x));
        }
        else {
            return Math.sin(x); // defaults in radians
        }
    }

    public static double cos(double x, String units) {
        if (units.equals("degrees")) {
            return Math.cos(Math.toRadians(x));
        }
        else {
            return Math.cos(x); // defaults in radians
        }
    }

    public static double tan(double x, String units) {
        if (units.equals("degrees")) {
            return Math.tan(Math.toRadians(x));
        }
        else {
            return Math.tan(x); // defaults in radians
        }
    }

    public static double asin(double x, String units) {
        if (units.equals("degrees")) {
            return Math.asin(Math.toRadians(x));
        }
        else {
            return Math.asin(x); // defaults in radians
        }
    }

    public static double acos(double x, String units) {
        if (units.equals("degrees")) {
            return Math.acos(Math.toRadians(x));
        }
        else {
            return Math.acos(x); // defaults in radians
        }
    }

    public static double atan(double x, String units) {
        if (units.equals("degrees")) {
            return Math.atan(Math.toRadians(x));
        }
        else {
            return Math.atan(x); // defaults in radians
        }
    }

    public static double log(double x) {
        return Math.log10(x);
    }

    public static double inverseLog(double x) {
        return Math.pow(10.0, x);
    }

    public static double naturalLog(double x) {
        return Math.log(x);
    }

    public static double inverseNaturalLog(double x) {
        return Math.pow(Math.E, x);
    }

    public static long factorial(int x) {
        long factorial = 1;
        for (int i = 2; i <= x; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
