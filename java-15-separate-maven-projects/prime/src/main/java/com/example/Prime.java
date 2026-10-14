package com.example;

public class Prime {

    // Check whether a number is prime
    public boolean calculate(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i <= number / i; i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Prime program = new Prime();
        System.out.println("17 is prime: " + program.calculate(17));
    }
}
