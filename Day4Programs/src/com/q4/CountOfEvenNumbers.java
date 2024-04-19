package com.q4;

public class CountOfEvenNumbers {
	public static void main(String[] args) {
		int count = 0;

		// Loop through numbers from 1 to 100
		for (int i = 1; i <= 100; i++) {
			// Check if the number is even
			if (i % 2 == 0) {
				// If it's even, increment the count
				count++;
			}
		}

		// Print the count of even numbers
		System.out.println("Count of even numbers from 1 to 100: " + count);
	}
}
