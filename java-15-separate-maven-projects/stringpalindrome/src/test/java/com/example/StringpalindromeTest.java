package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringpalindromeTest {
    private final Stringpalindrome program = new Stringpalindrome();

    @Test
    void testCalculate() {
        assertTrue(program.calculate("Madam"));
        assertTrue(program.calculate("nurses run"));
        assertFalse(program.calculate("hello"));
        assertFalse(program.calculate(null));
    }
}
