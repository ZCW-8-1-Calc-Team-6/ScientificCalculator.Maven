package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.BasicFunctions;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import com.zipcodewilmington.scientificcalculator.ScientificFunctions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Created by leon on 2/9/18.
 */
public class sciCalcTests {

    // all tests here
    @Test
    void sinTest1() {
        assertEquals(0.08715574274765817, ScientificFunctions.sin(5.0, "degrees"));
    }

    @Test
    void sinTest2() {
        assertEquals(0.17364817766693033, ScientificFunctions.sin(10.0, "degrees"));
    }

    @Test
    void cosTest1() {
        assertEquals(0.9961946980917455, ScientificFunctions.cos(5.0,"degrees"));
    }

    @Test
    void cosTest2() {
        assertEquals(0.9902680687415704, ScientificFunctions.cos(8.0,"degrees"));
    }

    @Test
    void tanTest1() {
        assertEquals(0.08748866352592401, ScientificFunctions.tan(5.0,"degrees"));
    }
    @Test
    void tanTest2() {
        assertEquals(0.1227845609029046, ScientificFunctions.tan(7.0,"degrees"));
    }

    @Test
    void asinTest1() {
        assertEquals(1.5707963267948966, ScientificFunctions.asin(1.0,""));
    }

    @Test
    void asinTest2() {
        assertEquals(1.1197695149986342, ScientificFunctions.asin(0.9,""));
    }

    @Test
    void acosTest1() {
        assertEquals(0.0, ScientificFunctions.acos(1.0,""));
    }

    @Test
    void acosTest2() {
        assertEquals(1.0471975511965979, ScientificFunctions.acos(0.5,""));
    }

    @Test
    void atanTest1() {
        assertEquals(0.7853981633974483, ScientificFunctions.atan(1.0,""));
    }

    @Test
    void atanTest2() {
        assertEquals(0.4636476090008061, ScientificFunctions.atan(0.5,""));
    }

    @Test
    void logTest1() {
        assertEquals(1, ScientificFunctions.log(10));
    }

    @Test
    void logTest2() {
        assertEquals(2, ScientificFunctions.log(100));
    }

    @Test
    void inverseLogTest1() {
        assertEquals(10.0, ScientificFunctions.inverseLog(1));
    }

    @Test
    void inverseLogTest2() {
        assertEquals(15848.93192461114, ScientificFunctions.inverseLog(4.2));
    }

    @Test
    void naturalLogTest1() {
        assertEquals(0.0, ScientificFunctions.naturalLog(1));
    }

    @Test
    void naturalLogTest2() {
        assertEquals(0.6931471805599453, ScientificFunctions.naturalLog(2));
    }

    @Test
    void inverseNatLogTest1() {
        assertEquals(7.3890560989306495, ScientificFunctions.inverseNaturalLog(2));
    }

    @Test
    void inverseNatLogTest2() {
        assertEquals(148.41315910257657, ScientificFunctions.inverseNaturalLog(5));
    }

    @Test
    void factorialTest1() {
        assertEquals(5040.0, ScientificFunctions.factorial(7));
    }

    @Test
    void factorialTest2() {
        assertEquals(2, ScientificFunctions.factorial(2));
    }

    @Test
    void getTextFromField() {
        String calculator = new MainApplication().getTextField();
        String expectedResults = "0";

        assertEquals(expectedResults, calculator);
    }

//    @Test
//    void testSwitchUnitMode() {
//        String calculator = new MainApplication().switchUnitsMode();
//        String expectedResults = "degrees";
//
//        assertEquals(expectedResults, calculator);
//    }

}
