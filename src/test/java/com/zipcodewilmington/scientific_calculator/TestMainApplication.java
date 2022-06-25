package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.BasicFunctions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
    void fiveMinusTwoEqualsSeven(){
        test calculator = new BasicFunctions();
        assertEquals(3, BasicFunctions.sub(5, 2));
    }

    @Test
    void tenMinusTwoEqualsEight(){
        test calculator = new BasicFunctions();
        assertEquals(2, BasicFunctions.sub(10, 8));
    }
}
