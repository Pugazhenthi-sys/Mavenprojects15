package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumofarrayTest {
    private final Sumofarray program = new Sumofarray();

    @Test
    void testCalculate() {
        assertEquals(10, program.calculate(new int[]{1, 2, 3, 4}));
        assertEquals(0, program.calculate(new int[]{}));
        assertEquals(-6, program.calculate(new int[]{-1, -2, -3}));
    }
}
