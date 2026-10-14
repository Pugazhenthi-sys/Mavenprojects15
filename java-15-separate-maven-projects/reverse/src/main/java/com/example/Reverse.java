package com.example;

public class Reverse {

    // Reverse a number
    public long calculate(int number) {
        long value = Math.abs((long) number);
        long reversed = 0;
        while (value > 0) {
            reversed = reversed * 10 + value % 10;
            value /= 10;
        }
        return number < 0 ? -reversed : reversed;
    }

    public static void main(String[] args) {
        Reverse program = new Reverse();
        System.out.println("Reverse = " + program.calculate(1234));
    }
}
