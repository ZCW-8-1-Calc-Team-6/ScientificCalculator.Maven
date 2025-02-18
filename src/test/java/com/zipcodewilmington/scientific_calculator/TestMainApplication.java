//package com.zipcodewilmington.scientific_calculator;
//import com.zipcodewilmington.scientificcalculator.BasicFunctions;
//import com.zipcodewilmington.scientificcalculator.MainApplication;
//import com.zipcodewilmington.scientificcalculator.ScientificFunctions;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Test;
//
//import javax.swing.*;
//
//
///**
// * Created by leon on 2/9/18.
// */
//public class TestMainApplication {
//
//    // all tests here
//
//    //Addition Tests
//    @Test
//    void additionTest1(){
//        double expectedResults = 4.0;
//        String str1 = BasicFunctions.add(2.0,2.0);
//        double results = Double.parseDouble(str1);
//
//        assertEquals(expectedResults,results);
//    }
//    @Test
//    void additionTest2(){
//        double expectedResults = 7.0;
//        String str1 = BasicFunctions.add(5.0,2.0);
//        double results = Double.parseDouble(str1);
//
//        assertEquals(expectedResults,results);
//        //assertEquals(7.0, BasicFunctions.add(5.0, 2.0));
//    }
//
//    //Subtraction Tests
//    @Test
//    void subTest1(){
//       double expectedResults = 3.0;
//        String str1 = BasicFunctions.subtract(5.0,2.0);
//        double results = Double.parseDouble(str1);
//
//        assertEquals(expectedResults,results);
//    }
//
//    @Test
//    void subTest2(){
//        double expectedResults = 2.0;
//        String str1 = BasicFunctions.subtract(10.0,8.0);
//        double results = Double.parseDouble(str1);
//
//        assertEquals(expectedResults,results);
//    }
//
//    //Multiplication Tests
//    @Test
//    void MultiTest1(){
//        double expectedResults = 10.0;
//        String str1 = BasicFunctions.multiply(5.0,2.0);
//        double results = Double.parseDouble(str1);
//
//        assertEquals(expectedResults,results);
//    }
//
//    @Test
//    void MultiTest2(){
//        double expectedResults = 24.0;
//        String str1 = BasicFunctions.multiply(8.0,3.0);
//        double results = Double.parseDouble(str1);
//
//        assertEquals(expectedResults,results);
//    }
//
//    //Division Tests
//    @Test
//    void divideTest1(){
//        double expectedResults = 2.0;
//        String str1 = BasicFunctions.divide(8.0,4.0);
//        double results = Double.parseDouble(str1);
//
//        assertEquals(expectedResults,results);
//    }
//
//    @Test
//    void divideTest2(){
//        double expectedResults = 1.142857142857143;
//        String str1 = BasicFunctions.divide(8.0,7.0);
//        double results = Double.parseDouble(str1);
//
//        assertEquals(expectedResults,results,1.14285714286712);
//    }
////
////    //Squaring Tests
////    @Test
////    void squareSix(){
////        BasicFunctions calculator = new BasicFunctions();
////        assertEquals(36.0, BasicFunctions.square(36.0));
////    }
////
////    @Test
////    void squareTen(){
////        BasicFunctions calculator = new BasicFunctions();
////        assertEquals(100.0, BasicFunctions.square(10.0));
////    }
////
//    //Sqrt Tests
//    @Test
//    void sqrtTest1(){
//        double expectedResults = 10.0;
//        double results = BasicFunctions.sqrt(100.0);
//        //double results = Double.parseDouble(str1);
//
//        assertEquals(expectedResults,results);
//    }
//
//    @Test
//    void sqrtTest2(){
//        double expectedResults = 3.872983346207417;
//        double results = BasicFunctions.sqrt(15.0);
//        //double results = Double.parseDouble(str1);
//
//        assertEquals(expectedResults,results,3.8729833462074);
//    }
////
////    //Variable exponentiation
////    @Test
////    void varExpOneHundred(){
////        BasicFunctions calculator = new BasicFunctions();
////        assertEquals(10.0, BasicFunctions.exp(100.0));
////    }
//
//    //    @Test
////    void inverseNum(){
////        BasicFunctions calculator = new BasicFunctions();
////        assertEquals(-5.0, BasicFunctions.inverseNum(5.0));
////    }
//
//        @Test
//    void inverseSignTest1(){
//            double expectedResults = -100.0;
//            String str1 = BasicFunctions.invertSign(100.0);
//            double results = Double.parseDouble(str1);
//
//            assertEquals(expectedResults,results);
//    }
//
//    @Test
//    void inverseSignTest2(){
//        double expectedResults = -15.0;
//        String str1 = BasicFunctions.invertSign(15.0);
//        double results = Double.parseDouble(str1);
//
//        assertEquals(expectedResults,results);
//    }
//
//    @Test
//    void sinTest1() {
//        assertEquals(0.08715574274765817, ScientificFunctions.sin(5.0, "degrees"));
//    }
//
//    @Test
//    void sinTest2() {
//        assertEquals(0.17364817766693033, ScientificFunctions.sin(10.0, "degrees"));
//    }
//
//    @Test
//    void cosTest1() {
//        assertEquals(0.9961946980917455, ScientificFunctions.cos(5.0,"degrees"));
//    }
//
//    @Test
//    void cosTest2() {
//        assertEquals(0.9902680687415704, ScientificFunctions.cos(8.0,"degrees"));
//    }
//
//    @Test
//    void tanTest1() {
//        assertEquals(0.08748866352592401, ScientificFunctions.tan(5.0,"degrees"));
//    }
//    @Test
//    void tanTest2() {
//        assertEquals(0.1227845609029046, ScientificFunctions.tan(7.0,"degrees"));
//    }
//
//    @Test
//    void asinTest1() {
//        assertEquals(1.5707963267948966, ScientificFunctions.asin(1.0,""));
//    }
//
//    @Test
//    void asinTest2() {
//        assertEquals(1.1197695149986342, ScientificFunctions.asin(0.9,""));
//    }
//
//    @Test
//    void acosTest1() {
//        assertEquals(0.0, ScientificFunctions.acos(1.0,""));
//    }
//
//    @Test
//    void acosTest2() {
//        assertEquals(1.0471975511965979, ScientificFunctions.acos(0.5,""));
//    }
//
//    @Test
//    void atanTest1() {
//        assertEquals(0.7853981633974483, ScientificFunctions.atan(1.0,""));
//    }
//
//    @Test
//    void atanTest2() {
//        assertEquals(0.4636476090008061, ScientificFunctions.atan(0.5,""));
//    }
//
//    @Test
//    void logTest1() {
//        assertEquals(1, ScientificFunctions.log(10));
//    }
//
//    @Test
//    void logTest2() {
//        assertEquals(2, ScientificFunctions.log(100));
//    }
//
//    @Test
//    void inverseLogTest1() {
//        assertEquals(10.0, ScientificFunctions.inverseLog(1));
//    }
//
//    @Test
//    void inverseLogTest2() {
//        assertEquals(15848.93192461114, ScientificFunctions.inverseLog(4.2));
//    }
//
//    @Test
//    void naturalLogTest1() {
//        assertEquals(0.0, ScientificFunctions.naturalLog(1));
//    }
//
//    @Test
//    void naturalLogTest2() {
//        assertEquals(0.6931471805599453, ScientificFunctions.naturalLog(2));
//    }
//
//    @Test
//    void inverseNatLogTest1() {
//        assertEquals(7.3890560989306495, ScientificFunctions.inverseNaturalLog(2));
//    }
//
//    @Test
//    void inverseNatLogTest2() {
//        assertEquals(148.41315910257657, ScientificFunctions.inverseNaturalLog(5));
//    }
//
//    @Test
//    void factorialTest1() {
//        assertEquals(5040.0, ScientificFunctions.factorial(7));
//    }
//
//    @Test
//    void factorialTest2() {
//        assertEquals(2, ScientificFunctions.factorial(2));
//    }
//
//    @Test
//    void getTextFromField() {
//        String calculator = new MainApplication().getTextField();
//        String expectedResults = "0";
//
//        assertEquals(expectedResults, calculator);
//    }
//
////    @Test
////    void testSwitchUnitMode() {
////        String calculator = new MainApplication().switchUnitsMode();
////        String expectedResults = "degrees";
////
////        assertEquals(expectedResults, calculator);
////    }
//
//}
