package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.BasicFunctions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Created by leon on 2/9/18.
 */
public class CoreTest {

    // all tests here

    //Addition Tests
    @Test
    void additionTest1(){
        double expectedResults = 4.0;
        String str1 = BasicFunctions.add(2.0,2.0);
        double results = Double.parseDouble(str1);

        assertEquals(expectedResults,results);
    }
    @Test
    void additionTest2(){
        double expectedResults = 7.0;
        String str1 = BasicFunctions.add(5.0,2.0);
        double results = Double.parseDouble(str1);

        assertEquals(expectedResults,results);
        //assertEquals(7.0, BasicFunctions.add(5.0, 2.0));
    }

    //Subtraction Tests
    @Test
    void subTest1(){
       double expectedResults = 3.0;
        String str1 = BasicFunctions.subtract(5.0,2.0);
        double results = Double.parseDouble(str1);

        assertEquals(expectedResults,results);
    }

    @Test
    void subTest2(){
        double expectedResults = 2.0;
        String str1 = BasicFunctions.subtract(10.0,8.0);
        double results = Double.parseDouble(str1);

        assertEquals(expectedResults,results);
    }

    //Multiplication Tests
    @Test
    void MultiTest1(){
        double expectedResults = 10.0;
        String str1 = BasicFunctions.multiply(5.0,2.0);
        double results = Double.parseDouble(str1);

        assertEquals(expectedResults,results);
    }

    @Test
    void MultiTest2(){
        double expectedResults = 24.0;
        String str1 = BasicFunctions.multiply(8.0,3.0);
        double results = Double.parseDouble(str1);

        assertEquals(expectedResults,results);
    }

    //Division Tests
    @Test
    void divideTest1(){
        double expectedResults = 2.0;
        String str1 = BasicFunctions.divide(8.0,4.0);
        double results = Double.parseDouble(str1);

        assertEquals(expectedResults,results);
    }

    @Test
    void divideTest2(){
        double expectedResults = 1.142857142857143;
        String str1 = BasicFunctions.divide(8.0,7.0);
        double results = Double.parseDouble(str1);

        assertEquals(expectedResults,results,1.14285714286712);
    }
//
//    //Squaring Tests
//    @Test
//    void squareSix(){
//        BasicFunctions calculator = new BasicFunctions();
//        assertEquals(36.0, BasicFunctions.square(36.0));
//    }
//
//    @Test
//    void squareTen(){
//        BasicFunctions calculator = new BasicFunctions();
//        assertEquals(100.0, BasicFunctions.square(10.0));
//    }
//
    //Sqrt Tests
    @Test
    void sqrtTest1(){
        double expectedResults = 10.0;
        String str1 = BasicFunctions.sqrt(100.0);
        double results = Double.parseDouble(str1);

        assertEquals(expectedResults,results);
    }

    @Test
    void sqrtTest2(){
        double expectedResults = 3.872983346207417;
        String str1 = BasicFunctions.sqrt(15.0);
        double results = Double.parseDouble(str1);

        assertEquals(expectedResults,results,3.8729833462074);
    }
//
//    //Variable exponentiation
//    @Test
//    void varExpOneHundred(){
//        BasicFunctions calculator = new BasicFunctions();
//        assertEquals(10.0, BasicFunctions.exp(100.0));
//    }

    //    @Test
//    void inverseNum(){
//        BasicFunctions calculator = new BasicFunctions();
//        assertEquals(-5.0, BasicFunctions.inverseNum(5.0));
//    }

        @Test
    void inverseSignTest1(){
            double expectedResults = -100.0;
            String str1 = BasicFunctions.invertSign(100.0);
            double results = Double.parseDouble(str1);

            assertEquals(expectedResults,results);
    }

    @Test
    void inverseSignTest2(){
        double expectedResults = -15.0;
        String str1 = BasicFunctions.invertSign(15.0);
        double results = Double.parseDouble(str1);

        assertEquals(expectedResults,results);
    }
}

