package com.example;

public class Factorial {

    // Calculate factorial of a number
    public long calculate(int number) {
        if (number < 0) throw new IllegalArgumentException("Number must not be negative");
        long result = 1;
        for (int i = 2; i <= number; i++) result = Math.multiplyExact(result, i);
        return result;
    }

    public static void main(String[] args) {
        Factorial program = new Factorial();
        System.out.println("Factorial = " + program.calculate(5));
    }
}
