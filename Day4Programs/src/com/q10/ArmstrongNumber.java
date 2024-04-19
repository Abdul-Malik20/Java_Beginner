package com.q10;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a number
		System.out.print("Enter a number: ");

		// Read the user's input as an integer
		int number = scanner.nextInt();

		// Check if the number is an Armstrong number
		boolean isArmstrong = isArmstrongNumber(number);

		// Print the result
		if (isArmstrong) {
			System.out.println(number + " is an Armstrong number.");
		} else {
			System.out.println(number + " is not an Armstrong number.");
		}

		// Close the scanner to prevent resource leak
		scanner.close();
	}

	// Method to check if a number is an Armstrong number
	public static boolean isArmstrongNumber(int n) {
		int originalNumber, remainder, result = 0, digits = 0;

		// Count number of digits
		originalNumber = n;
		while (originalNumber != 0) {
			originalNumber /= 10;
			++digits;
		}

		// Calculate sum of nth power of each digit
		originalNumber = n;
		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, digits);
			originalNumber /= 10;
		}

		// Check if the number is an Armstrong number
		return result == n;
	}
}
