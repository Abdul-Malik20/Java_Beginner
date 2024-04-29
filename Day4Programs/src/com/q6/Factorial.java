package com.q6;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a number
		System.out.print("Enter a number: ");

		// Read the user's input as an integer
		int number = scanner.nextInt();

		// Calculate the factorial of the number
		long factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}

		// Print the factorial of the number
		System.out.println("Factorial of " + number + " is: " + factorial);

		// Close the scanner to prevent resource leak
		scanner.close();
	}
}