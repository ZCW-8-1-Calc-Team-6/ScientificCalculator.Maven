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
//        asserEquals(4.0, BasicFunctions.divide(8.0, 4.0));
//    }
//
//    @Test
//    void eightDividedBySeven(){
//        BasicFunctions calculator = new BasicFunctions();
//        asserEquals(0, BasicFunctions.divide(8.0, 7.0));
//    }
//
//    //Squaring Tests
//    @Test
//    void squareSix(){
//        BasicFunctions calculator = new BasicFunctions();
//        asserEquals(36.0, BasicFunctions.square(36.0));
//    }
//
//    @Test
//    void squareTen(){
//        BasicFunctions calculator = new BasicFunctions();
//        asserEquals(100.0, BasicFunctions.square(10.0));
//    }
//
//    //Sqrt Tests
//    @Test
//    void sqrtOneHundred(){
//        BasicFunctions calculator = new BasicFunctions();
//        asserEquals(10.0, BasicFunctions.sqrt(100.0));
//    }
//
//    //Variable exponentiation
//    @Test
//    void varExpOneHundred(){
//        BasicFunctions calculator = new BasicFunctions();
//        asserEquals(10.0, BasicFunctions.exp(100.0));
//    }

    @Test
    void sin() {
        ScientificFunctions calculator = new ScientificFunctions();
        assertEquals(0.087155742747658, ScientificFunctions.sin(5));
    }

}
