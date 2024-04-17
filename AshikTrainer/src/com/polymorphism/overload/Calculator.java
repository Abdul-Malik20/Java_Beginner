package com.polymorphism.overload;

public class Calculator {

	// Method to add two integers
	public int add(int a, int b) {
		return a + b;
	}

	// Method to add three integers
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	// Method to add two long numbers
	public long add(long a, long b) {
		return a + b;
	}

	// Method to add three long numbers
	public long add(long a, long b, long c) {
		return a + b + c;
	}

	// Method to add two float numbers
	public float add(float a, float b) {
		return a + b;
	}

	// Method to add three float numbers
	public float add(float a, float b, float c) {
		return a + b + c;
	}

	// Method to add two double numbers
	public double add(double a, double b) {
		return a + b;
	}

	// Method to add three double numbers
	public double add(double a, double b, double c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		// Adding two integers
		int sum1 = calculator.add(5, 10);
		System.out.println("Sum of 5 and 10 is: " + sum1);

		// Adding three integers
		int sum2 = calculator.add(5, 10, 15);
		System.out.println("Sum of 5, 10, and 15 is: " + sum2);

		// Adding two long numbers
		long sum3 = calculator.add(1000000000L, 2000000000L);
		System.out.println("Sum of 1000000000 and 2000000000 is: " + sum3);

		// Adding three long numbers
		long sum4 = calculator.add(1000000000L, 2000000000L, 3000000000L);
		System.out.println("Sum of 1000000000, 2000000000, and 3000000000 is: " + sum4);

		// Adding two float numbers
		float sum5 = calculator.add(3.5f, 2.7f);
		System.out.println("Sum of 3.5 and 2.7 is: " + sum5);

		// Adding three float numbers
		float sum6 = calculator.add(3.5f, 2.7f, 1.2f);
		System.out.println("Sum of 3.5, 2.7, and 1.2 is: " + sum6);

		// Adding two double numbers
		double sum7 = calculator.add(3.5, 2.7);
		System.out.println("Sum of 3.5 and 2.7 is: " + sum7);

		// Adding three double numbers
		double sum8 = calculator.add(3.5, 2.7, 1.2);
		System.out.println("Sum of 3.5, 2.7, and 1.2 is: " + sum8);
	}
}
