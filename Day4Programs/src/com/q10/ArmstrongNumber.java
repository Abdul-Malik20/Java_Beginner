package com.q10;

//import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		//Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a number
		//System.out.print("Enter a number: ");

		// Read the user's input as an integer
		int number = 153;
int n1 = number;
		// Check if the number is an Armstrong number
		int armNumber = 0;
		do {
			int remainder = number % 10;
			armNumber = armNumber + (remainder * remainder * remainder);
			number = number/10;
		} while (number > 0);
		if(n1==number) {
			System.out.println("Yes this Armstrong");
		}else {System.out.println("no");}
	}
}
