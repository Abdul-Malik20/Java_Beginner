package com.q7;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3;

		System.out.println("Fibonacci series up to 100:");

		// Print the first two Fibonacci numbers
		System.out.print(n1 + " " + n2);

		// Generate Fibonacci numbers until reaching 100
		n3 = n1 + n2;
		while (n3 <= 100) {
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
		}
	}
}
