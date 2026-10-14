package com.example;

public class Sumof {

    // Addition of two numbers
    public int calculate(int a, int b) { return a + b; }

    public static void main(String[] args) {
        Sumof program = new Sumof();
        System.out.println("Sum = " + program.calculate(10, 20));
    }
}
