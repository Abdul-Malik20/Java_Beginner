package com.q3;

public class SumOfOddNumbers {
	public static void main(String[] args) {
		int sum = 0;

		// Loop through numbers from 1 to 100
		for (int i = 1; i <= 100; i++) {
			// Check if the number is odd
			if (i % 2 != 0) {
				// If it's odd, add it to the sum
				sum += i;
			}
		}

		// Print the sum of odd numbers
		System.out.println("Sum of odd numbers from 1 to 100: " + sum);
	}
}
