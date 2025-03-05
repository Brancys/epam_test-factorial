package com.epam.rd.autotasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialRegularInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void testZeroInput() {
        assertEquals("1", factorial.factorial("0"), "Factorial of 0 should be 1");
    }

    @Test
    void testLargeInput() {
        assertEquals("3628800", factorial.factorial("10"), "Factorial of 10 should be 3628800");
    }

    @Test
    void testSingleDigitInput() {
        assertEquals("6", factorial.factorial("3"), "Factorial of 3 should be 6");
    }

    @Test
    void testMaxIntegerInput() {
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial(String.valueOf(Integer.MAX_VALUE)), "Should throw exception for large inputs");
    }
} 