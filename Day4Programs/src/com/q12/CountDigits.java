package com.q12;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a number
		System.out.print("Enter a number: ");

		// Read the user's input as an integer
		int number = scanner.nextInt();

		// Count the number of digits
		int digitCount = countDigits(number);

		// Print the count of digits
		System.out.println("Number of digits: " + digitCount);

		// Close the scanner to prevent resource leak
		scanner.close();
	}

	// Method to count the number of digits in a number
	public static int countDigits(int n) {
		int count = 0;
		while (n != 0) {
			n /= 10;
			count++;
		}
		return count;
	}
}
