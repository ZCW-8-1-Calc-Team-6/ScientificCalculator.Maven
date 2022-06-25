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
        test calculator = new BasicFunctions();
        assertEquals(4, BasicFunctions.add(2, 2));
    }
    @Test
    void fivePlusTwoEqualsSeven(){
        test calculator = new BasicFunctions();
        assertEquals(7, BasicFunctions.add(5, 2));
    }

    //Subtraction Tests
    @Test
    void fiveMinusTwoEqualsThree(){
        test calculator = new BasicFunctions();
        assertEquals(3, BasicFunctions.sub(5, 2));
    }

    @Test
    void tenMinusTwoEqualsEight(){
        test calculator = new BasicFunctions();
        assertEquals(2, BasicFunctions.sub(10, 8));
    }

    //Multiplication Tests
    @Test
    void fiveTimesTwoEqualsTen(){
        test calculator = new BasicFunctions();
        assertEquals(10, BasicFunctions.multiply(5, 2));
    }

    @Test
    void eightTimesThreeEqualsTwentyFour(){
        test calculator = new BasicFunctions();
        assertEquals(24, BasicFunctions.multiply(8, 3));
    }

    //Division Tests
    @Test
    void eightDividedByTwoEqualsFour(){
        test calculator = new BasicFunctions();
        asserEquals(4, BasicFunctions.divide(8, 4));
    }

    @Test
    void eightDividedBySeven(){
        test calculator = new BasicFunctions();
        asserEquals(, BasicFunctions.divide(8, 7));
    }


}
