package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumofTest {
    private final Sumof program = new Sumof();

    @Test
    void testCalculate() {
        assertEquals(30, program.calculate(10, 20));
        assertEquals(-2, program.calculate(-5, 3));
    }
}
