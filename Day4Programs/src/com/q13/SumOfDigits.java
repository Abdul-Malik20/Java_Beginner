package com.q13;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read the user's input as an integer
        int number = scanner.nextInt();

        // Find the sum of the digits
        int digitSum = sumOfDigits(number);

        // Print the sum of the digits
        System.out.println("Sum of digits: " + digitSum);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
}
