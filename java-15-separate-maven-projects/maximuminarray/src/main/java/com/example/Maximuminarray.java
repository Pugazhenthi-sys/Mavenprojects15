package com.example;

public class Maximuminarray {

    // Find the maximum element in an array
    public int calculate(int[] values) {
        if (values == null || values.length == 0)
            throw new IllegalArgumentException("Array must not be null or empty");
        int maximum = values[0];
        for (int value : values) if (value > maximum) maximum = value;
        return maximum;
    }

    public static void main(String[] args) {
        Maximuminarray program = new Maximuminarray();
        System.out.println("Maximum = " + program.calculate(new int[]{3, 9, 2}));
    }
}
