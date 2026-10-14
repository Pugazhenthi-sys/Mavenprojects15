package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReversestringTest {
    private final Reversestring program = new Reversestring();

    @Test
    void testCalculate() {
        assertEquals("olleh", program.calculate("hello"));
        assertEquals("", program.calculate(""));
        assertEquals("321", program.calculate("123"));
    }
}
