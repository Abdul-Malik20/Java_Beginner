package com.questions;

import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        // Count the number of vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;

        // Iterate through each character of the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Check if the character is a letter
            if ((c >= 'a' && c <= 'z')) {
                // Check if the letter is a vowel
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Print the counts
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);

        scanner.close();
    }
}
