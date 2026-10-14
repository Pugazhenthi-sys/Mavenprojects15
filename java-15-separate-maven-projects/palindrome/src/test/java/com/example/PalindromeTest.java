package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    private final Palindrome program = new Palindrome();

    @Test
    void testCalculate() {
        assertTrue(program.calculate(121));
        assertTrue(program.calculate(0));
        assertFalse(program.calculate(123));
        assertFalse(program.calculate(-121));
    }
}
