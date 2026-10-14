package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GradeTest {
    private final Grade program = new Grade();

    @Test
    void testCalculate() {
        assertEquals("A", program.calculate(95));
        assertEquals("B", program.calculate(85));
        assertEquals("C", program.calculate(75));
        assertEquals("D", program.calculate(65));
        assertEquals("E", program.calculate(55));
        assertEquals("F", program.calculate(35));
        assertThrows(IllegalArgumentException.class, () -> program.calculate(101));
    }
}
