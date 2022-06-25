package com.zipcodewilmington.scientific_calculator;
<<<<<<< HEAD
import com.zipcodewilmington.scientificcalculator.BasicFunctions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
=======
import javax.swing.*;
>>>>>>> 79e78b5a18c5712ac03860679a2dbc72bc5c1ca9

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    // all tests here

    //Addition Tests
    @Test
    void twoPlusTwoEqualsFour(){
        BasicFunctions calculator = new BasicFunctions();
        assertEquals(4, BasicFunctions.add(2.0, 2.0));
    }
    @Test
    void fivePlusTwoEqualsSeven(){
        BasicFunctions calculator = new BasicFunctions();
        assertEquals(7, BasicFunctions.add(5.0, 2.0));
    }

    //Subtraction Tests
    @Test
    void fiveMinusTwoEqualsThree(){
        BasicFunctions calculator = new BasicFunctions();
        assertEquals(3.0, BasicFunctions.sub(5.0, 2.0));
    }

    @Test
    void tenMinusTwoEqualsEight(){
        BasicFunctions calculator = new BasicFunctions();
        assertEquals(2.0, BasicFunctions.sub(10.0, 8.0));
    }

    //Multiplication Tests
    @Test
    void fiveTimesTwoEqualsTen(){
        BasicFunctions calculator = new BasicFunctions();
        assertEquals(10.0, BasicFunctions.multiply(5.0, 2.0));
    }

    @Test
    void eightTimesThreeEqualsTwentyFour(){
        BasicFunctions calculator = new BasicFunctions();
        assertEquals(24.0, BasicFunctions.multiply(8.0, 3.0));
    }

    //Division Tests
    @Test
    void eightDividedByTwoEqualsFour(){
        BasicFunctions calculator = new BasicFunctions();
        asserEquals(4.0, BasicFunctions.divide(8.0, 4.0));
    }

    @Test
    void eightDividedBySeven(){
        BasicFunctions calculator = new BasicFunctions();
        asserEquals(, BasicFunctions.divide(8.0, 7.0));
    }

    //Squaring Tests
    @Test
    void squareSix(){
        BasicFunctions calculator = new BasicFunctions();
        asserEquals(36.0, BasicFunctions.square(36.0));
    }


}
