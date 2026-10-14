package com.example;

public class Stringpalindrome {

    // Check whether a string is a palindrome
    public boolean calculate(String text) {
        if (text == null) return false;
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    public static void main(String[] args) {
        Stringpalindrome program = new Stringpalindrome();
        System.out.println("Madam is palindrome: " + program.calculate("Madam"));
    }
}
