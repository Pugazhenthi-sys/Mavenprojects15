package com.example;

public class Evenodd {

    // Check whether a number is even or odd
    public String calculate(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Evenodd program = new Evenodd();
        System.out.println("7 is " + program.calculate(7));
    }
}
