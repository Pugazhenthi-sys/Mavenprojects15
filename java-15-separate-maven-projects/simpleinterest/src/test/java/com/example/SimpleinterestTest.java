package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleinterestTest {
    private final Simpleinterest program = new Simpleinterest();

    @Test
    void testCalculate() {
        assertEquals(100.0, program.calculate(1000, 5, 2), 0.0001);
        assertEquals(0.0, program.calculate(0, 5, 2), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> program.calculate(-1, 5, 2));
    }
}
