package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximuminarrayTest {
    private final Maximuminarray program = new Maximuminarray();

    @Test
    void testCalculate() {
        assertEquals(9, program.calculate(new int[]{3, 9, 2}));
        assertEquals(-1, program.calculate(new int[]{-8, -1, -3}));
        assertThrows(IllegalArgumentException.class, () -> program.calculate(new int[]{}));
    }
}
