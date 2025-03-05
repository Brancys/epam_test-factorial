package com.epam.rd.autotasks;

public class Factorial {

    public String factorial(final String n) {
        if (n == null) throw new IllegalArgumentException("Input cannot be null");
        int val;
        try {
            val = Integer.parseInt(n);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Input must be an integer");
        }

        if (val < 0) throw new IllegalArgumentException("Negative numbers are not allowed");
        return String.valueOf(factorial(val));
    }

    private long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
