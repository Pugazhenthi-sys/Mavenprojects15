package com.example;

public class Palindrome {

    // Check whether an integer is a palindrome
    public boolean calculate(int number) {
        if (number < 0) return false;
        int original = number;
        long reversed = 0;
        int value = number;
        while (value > 0) {
            reversed = reversed * 10 + value % 10;
            value /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        Palindrome program = new Palindrome();
        System.out.println("1221 is palindrome: " + program.calculate(1221));
    }
}
