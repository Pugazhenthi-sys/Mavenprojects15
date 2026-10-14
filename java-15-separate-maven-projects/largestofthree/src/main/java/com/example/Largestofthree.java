package com.example;

public class Largestofthree {

    // Find the largest of three numbers
    public int calculate(int a, int b, int c) { return Math.max(a, Math.max(b, c)); }

    public static void main(String[] args) {
        Largestofthree program = new Largestofthree();
        System.out.println("Largest = " + program.calculate(10, 25, 15));
    }
}
