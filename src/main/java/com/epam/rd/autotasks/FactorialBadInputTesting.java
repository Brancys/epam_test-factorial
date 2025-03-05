package com.epam.rd.autotasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialBadInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial(null),
                "Expected IllegalArgumentException for null input");
    }

    @Test
    void testNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial("-5"),
                "Expected IllegalArgumentException for negative input");
    }

    @Test
    void testFractionalInput() {
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial("4.5"),
                "Expected IllegalArgumentException for fractional input");
    }

    @Test
    void testNonDigitalInput() {
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial("abc"),
                "Expected IllegalArgumentException for non-digit input");
    }
}
