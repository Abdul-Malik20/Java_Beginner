package com.questions;

import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Count the number of uppercase letters, lowercase letters, digits, and special characters
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        // Iterate through each character of the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Check if the character is uppercase
            if (c >= 'A' && c <= 'Z') {
                uppercaseCount++;
            }
            // Check if the character is lowercase
            else if (c >= 'a' && c <= 'z') {
                lowercaseCount++;
            }
            // Check if the character is a digit
            else if (c >= '0' && c <= '9') {
                digitCount++;
            }
            // Check if the character is a special character
            else {
                specialCharCount++;
            }
        }

        // Print the counts
        System.out.println("Caps count: " + uppercaseCount);
        System.out.println("Small count: " + lowercaseCount);
        System.out.println("Number count: " + digitCount);
        System.out.println("Special char count: " + specialCharCount);

        scanner.close();
    }
}

