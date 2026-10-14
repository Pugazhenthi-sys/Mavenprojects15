package com.example;

public class Reversestring {

    // Reverse a string
    public String calculate(String text) {
        if (text == null) throw new IllegalArgumentException("Text must not be null");
        return new StringBuilder(text).reverse().toString();
    }

    public static void main(String[] args) {
        Reversestring program = new Reversestring();
        System.out.println("Reversed string = " + program.calculate("hello"));
    }
}
