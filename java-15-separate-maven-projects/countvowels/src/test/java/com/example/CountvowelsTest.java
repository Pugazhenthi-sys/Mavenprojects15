package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountvowelsTest {
    private final Countvowels program = new Countvowels();

    @Test
    void testCalculate() {
        assertEquals(3, program.calculate("Hello World"));
        assertEquals(5, program.calculate("AEIOU"));
        assertEquals(0, program.calculate("rhythm"));
    }
}
