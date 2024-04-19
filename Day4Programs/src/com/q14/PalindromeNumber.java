package com.q14;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a number
		System.out.print("Enter a number: ");

		// Read the user's input as an integer
		int number = scanner.nextInt();

		// Check if the number is a palindrome
		boolean isPalindrome = isPalindromeNumber(number);

		// Print the result
		if (isPalindrome) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

		// Close the scanner to prevent resource leak
		scanner.close();
	}

	// Method to check if a number is a palindrome
	public static boolean isPalindromeNumber(int n) {
		int reversedNumber = reverse(n);
		return reversedNumber == n;
	}

	// Method to reverse a number
	public static int reverse(int n) {
		int reversedNumber = 0;
		while (n != 0) {
			int digit = n % 10;
			reversedNumber = reversedNumber * 10 + digit;
			n /= 10;
		}
		return reversedNumber;
	}
}
