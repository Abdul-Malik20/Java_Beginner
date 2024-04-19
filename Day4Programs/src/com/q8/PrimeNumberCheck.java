package com.q8;

import java.util.Scanner;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a number
		System.out.print("Enter a number: ");

		// Read the user's input as an integer
		int number = scanner.nextInt();

		// Check if the number is prime
		boolean isPrime = isPrimeNumber(number);

		// Print the result
		if (isPrime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}

		// Close the scanner to prevent resource leak
		scanner.close();
	}

	// Method to check if a number is prime
	public static boolean isPrimeNumber(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
