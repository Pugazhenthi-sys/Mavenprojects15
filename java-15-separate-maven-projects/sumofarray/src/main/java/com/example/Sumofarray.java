package com.example;

public class Sumofarray {

    // Find the sum of elements in an array
    public int calculate(int[] values) {
        int sum = 0;
        for (int value : values) sum = Math.addExact(sum, value);
        return sum;
    }

    public static void main(String[] args) {
        Sumofarray program = new Sumofarray();
        System.out.println("Array sum = " + program.calculate(new int[]{1, 2, 3, 4}));
    }
}
