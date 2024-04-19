package com.q9;

public class Pattern1 {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 6; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
