package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.BasicFunctions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    // all tests here
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
}
