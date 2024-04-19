package com.q9;

public class Pattern3 {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 4; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
