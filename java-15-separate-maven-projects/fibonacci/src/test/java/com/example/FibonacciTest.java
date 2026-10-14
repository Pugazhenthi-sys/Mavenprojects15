package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    private final Fibonacci program = new Fibonacci();

    @Test
    void testCalculate() {
        assertArrayEquals(new long[]{0, 1, 1, 2, 3, 5, 8}, program.calculate(7));
        assertArrayEquals(new long[]{}, program.calculate(0));
        assertThrows(IllegalArgumentException.class, () -> program.calculate(-1));
    }
}
