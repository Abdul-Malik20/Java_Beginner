package com.questions;

public class StringSplitter {
    public static void main(String[] args) {
        // Given string
        String input = "Welcome to java class";

        // Split the string by space without using array methods
        int startIndex = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                System.out.println(input.substring(startIndex, i));
                startIndex = i + 1;
            }
        }
        // Print the last word
        System.out.println(input.substring(startIndex));
    }
}

