  package com.q11;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a number
		System.out.print("Enter a number: ");

		// Read the user's input as an integer
		int number = scanner.nextInt();

		// Reverse the number
		int reversedNumber = reverse(number);

		// Print the reversed number
		System.out.println("Reversed number: " + reversedNumber);

		// Close the scanner to prevent resource leak
		scanner.close();
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
