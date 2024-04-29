package com.questions;

import java.util.Scanner;

public class VowelReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Replace all vowels with '@'
        String replacedString = replaceVowels(input);

        // Print the modified string
        System.out.println("Output: " + replacedString);

        scanner.close();
    }

    // Method to replace all vowels with '@'
    private static String replaceVowels(String str) {
        StringBuilder replacedStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isVowel(c)) {
                replacedStr.append('@');
            } else {
                replacedStr.append(c);
            }
        }

        return replacedStr.toString();
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
