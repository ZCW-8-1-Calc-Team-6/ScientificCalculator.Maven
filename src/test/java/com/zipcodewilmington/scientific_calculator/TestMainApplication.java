package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.BasicFunctions;
import com.zipcodewilmington.scientificcalculator.ScientificFunctions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import javax.swing.*;


/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    // all tests here

    //Addition Tests
//    @Test
//    void twoPlusTwoEqualsFour(){
//        BasicFunctions calculator = new BasicFunctions();
//        assertEquals(4, BasicFunctions.add(2.0, 2.0));
//    }
//    @Test
//    void fivePlusTwoEqualsSeven(){
//        BasicFunctions calculator = new BasicFunctions();
//        assertEquals(7, BasicFunctions.add(5.0, 2.0));
//    }
//
//    //Subtraction Tests
//    @Test
//    void fiveMinusTwoEqualsThree(){
//        BasicFunctions calculator = new BasicFunctions();
//        assertEquals(3.0, BasicFunctions.sub(5.0, 2.0));
//    }
//
//    @Test
//    void tenMinusTwoEqualsEight(){
//        BasicFunctions calculator = new BasicFunctions();
//        assertEquals(2.0, BasicFunctions.sub(10.0, 8.0));
//    }
//
//    //Multiplication Tests
//    @Test
//    void fiveTimesTwoEqualsTen(){
//        BasicFunctions calculator = new BasicFunctions();
//        assertEquals(10.0, BasicFunctions.multiply(5.0, 2.0));
//    }
//
//    @Test
//    void eightTimesThreeEqualsTwentyFour(){
//        BasicFunctions calculator = new BasicFunctions();
//        assertEquals(24.0, BasicFunctions.multiply(8.0, 3.0));
//    }
//
//    //Division Tests
//    @Test
//    void eightDividedByTwoEqualsFour(){
//        BasicFunctions calculator = new BasicFunctions();
//        assertEquals(4.0, BasicFunctions.divide(8.0, 4.0));
//    }
//
//    @Test
//    void eightDividedBySeven(){
//        BasicFunctions calculator = new BasicFunctions();
//        assertEquals(0, BasicFunctions.divide(8.0, 7.0));
//    }
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
//    //Sqrt Tests
//    @Test
//    void sqrtOneHundred(){
//        BasicFunctions calculator = new BasicFunctions();
//        assertEquals(10.0, BasicFunctions.sqrt(100.0));
//    }
//
//    //Variable exponentiation
//    @Test
//    void varExpOneHundred(){
//        BasicFunctions calculator = new BasicFunctions();
//        assertEquals(10.0, BasicFunctions.exp(100.0));
//    }

    @Test
    void sinTest1() {
        ScientificFunctions calculator = new ScientificFunctions();
        assertEquals(0.08715574274765817, ScientificFunctions.sin(5.0, "degrees"));
    }

    @Test
    void cosTest1() {
        ScientificFunctions calculator = new ScientificFunctions();
        assertEquals(0.9961946980917455, ScientificFunctions.cos(5.0,"degrees"));
    }

    @Test
    void tanTest1() {
        ScientificFunctions calculator = new ScientificFunctions();
        assertEquals(0.08748866352592401, ScientificFunctions.tan(5.0,"degrees"));
    }

    @Test
    void asinTest1() {
        ScientificFunctions calculator = new ScientificFunctions();
        assertEquals(1.5707963267948966, ScientificFunctions.asin(1.0,""));
    }

    @Test
    void acosTest1() {
        ScientificFunctions calculator = new ScientificFunctions();
        assertEquals(0.0, ScientificFunctions.acos(1.0,""));
    }

    @Test
    void atanTest1() {
        ScientificFunctions calculator = new ScientificFunctions();
        assertEquals(0.7853981633974483, ScientificFunctions.atan(1.0,""));
    }

    @Test
    void logTest1() {
        ScientificFunctions calculator = new ScientificFunctions();
        assertEquals(1, ScientificFunctions.log(10));
    }

    @Test
    void inverseLogTest1() {
        ScientificFunctions calculator = new ScientificFunctions();
        assertEquals(10.0, ScientificFunctions.inverseLog(1));
    }

    @Test
    void naturalLogTest1() {
        ScientificFunctions calculator = new ScientificFunctions();
        assertEquals(0.0, ScientificFunctions.naturalLog(1));
    }

    @Test
    void inverseNatLogTest1() {
        ScientificFunctions calculator = new ScientificFunctions();
        assertEquals(7.3890560989306495, ScientificFunctions.inverseNaturalLog(2));
    }

    @Test
    void factorialTest1() {
        ScientificFunctions calculator = new ScientificFunctions();
        assertEquals(5040.0, ScientificFunctions.factorial(7));
    }

}
