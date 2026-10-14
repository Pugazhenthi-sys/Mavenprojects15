package com.example;

public class Fibonacci {

    // Generate the Fibonacci series
    public long[] calculate(int count) {
        if (count < 0) throw new IllegalArgumentException("Count must not be negative");
        long[] result = new long[count];
        long a = 0, b = 1;
        for (int i = 0; i < count; i++) {
            result[i] = a;
            if (i < count - 1) {
                long next = Math.addExact(a, b);
                a = b;
                b = next;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Fibonacci program = new Fibonacci();
        System.out.println("Fibonacci = " + java.util.Arrays.toString(program.calculate(7)));
    }
}
