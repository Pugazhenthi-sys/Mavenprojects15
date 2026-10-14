package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenoddTest {
    private final Evenodd program = new Evenodd();

    @Test
    void testCalculate() {
        assertEquals("Even", program.calculate(8));
        assertEquals("Odd", program.calculate(7));
        assertEquals("Even", program.calculate(0));
    }
}
