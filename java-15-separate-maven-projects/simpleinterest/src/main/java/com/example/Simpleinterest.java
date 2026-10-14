package com.example;

public class Simpleinterest {

    // Calculate simple interest
    public double calculate(double principal, double rate, double time) {
        if (principal < 0 || rate < 0 || time < 0)
            throw new IllegalArgumentException("Inputs must not be negative");
        return principal * rate * time / 100.0;
    }

    public static void main(String[] args) {
        Simpleinterest program = new Simpleinterest();
        System.out.println("Simple Interest = " + program.calculate(1000, 5, 2));
    }
}
