package com.zipcodewilmington.scientificcalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ScientificFunctionsTest {
    private ScientificFunctions objSciCalc;

    @BeforeEach
    public void setUp() {
        objSciCalc = new ScientificFunctions();
    }

    @Test
    public void sinTest1() {
        double num = 5;
        String unit = "degrees";
        double expectedResults = 0.08715574274765817;
        double results = objSciCalc.sin(num, unit);

        assertEquals(expectedResults, results, 0.000005d);
    }

    @Test
    void sinTest2() {
        ScientificFunctions calculator = new ScientificFunctions();
        assertEquals(0.17364817766693033, ScientificFunctions.sin(10.0, "degrees"));
    }



}