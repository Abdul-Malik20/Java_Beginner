package com.q5;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                // If it's even, print the number
                System.out.print(i+",");
            }
        }
    }
}
