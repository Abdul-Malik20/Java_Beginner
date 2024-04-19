package com.q2;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a number
		System.out.print("Enter a number: ");

		// Read the user's input as an integer
		int number = scanner.nextInt();

		// Check if the number is even or odd
		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

		// Close the scanner to prevent resource leak
		scanner.close();
	}
}
