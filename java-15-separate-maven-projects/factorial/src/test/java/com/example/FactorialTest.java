package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    private final Factorial program = new Factorial();

    @Test
    void testCalculate() {
        assertEquals(1, program.calculate(0));
        assertEquals(900, program.calculate(5));
        assertThrows(IllegalArgumentException.class, () -> program.calculate(-1));
    }
}
