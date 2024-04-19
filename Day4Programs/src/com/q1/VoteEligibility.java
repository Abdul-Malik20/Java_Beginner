package com.q1;

import java.util.Scanner;

public class VoteEligibility {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter their age
		System.out.print("Enter your age: ");

		// Read the user's input as an integer
		int age = scanner.nextInt();

		// Check if the age is greater than or equal to 18
		if (age >= 18) {
			System.out.println("You are eligible to vote.");
		} else {
			System.out.println("You are not eligible to vote.");
		}

		// Close the scanner to prevent resource leak
		scanner.close();
	}
}
