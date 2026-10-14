package com.example;

public class Grade {

    // Calculate a student's grade from marks
    public String calculate(int marks) {
        if (marks < 0 || marks > 100)
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        if (marks >= 90) return "A";
        if (marks >= 80) return "B";
        if (marks >= 70) return "C";
        if (marks >= 60) return "D";
        if (marks >= 50) return "E";
        return "F";
    }

    public static void main(String[] args) {
        Grade program = new Grade();
        System.out.println("Grade = " + program.calculate(85));
    }
}
