package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
    private final Reverse program = new Reverse();

    @Test
    void testCalculate() {
        assertEquals(4321, program.calculate(1234));
        assertEquals(21, program.calculate(120));
        assertEquals(-4321, program.calculate(-1234));
        assertEquals(0, program.calculate(0));
    }
}
