package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
    private final Prime program = new Prime();

    @Test
    void testCalculate() {
        assertFalse(program.calculate(-3));
        assertFalse(program.calculate(1));
        assertTrue(program.calculate(2));
        assertTrue(program.calculate(17));
        assertFalse(program.calculate(21));
    }
}
