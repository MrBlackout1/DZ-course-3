package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumCalculatorTest {
    private SumCalculator calculator;


    @BeforeEach
    public void beforeEach() {
        calculator = new SumCalculator();
    }

    @Test
    void sumTest1() {
        double actualResult = calculator.sum(1);
        double expectedResult = 1;

        assertEquals(expectedResult, actualResult,
                String.format("Some Error! Actual = %s, expected = %s", actualResult, expectedResult));
    }

    @Test
    void sumTest2() {
        double actualResult = calculator.sum(3);
        double expectedResult = 6;

        assertEquals(expectedResult, actualResult,
                String.format("Some Error! Actual = %s, expected = %s", actualResult, expectedResult));
    }

    @Test
    void sumTest3() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}