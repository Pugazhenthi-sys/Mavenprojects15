package com.example;

public class Countvowels {

    // Count vowels in a string
    public int calculate(String text) {
        if (text == null) throw new IllegalArgumentException("Text must not be null");
        int count = 0;
        for (char ch : text.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) >= 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Countvowels program = new Countvowels();
        System.out.println("Vowel count = " + program.calculate("Hello World"));
    }
}
