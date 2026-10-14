package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestofthreeTest {
    private final Largestofthree program = new Largestofthree();

    @Test
    void testCalculate() {
        assertEquals(9, program.calculate(3, 9, 5));
        assertEquals(7, program.calculate(7, 7, 2));
        assertEquals(-1, program.calculate(-8, -1, -3));
    }
}
