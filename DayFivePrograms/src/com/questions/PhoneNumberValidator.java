package com.questions;
import java.util.Scanner;

public class PhoneNumberValidator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the phone number: ");
		String phoneNumber = scanner.nextLine();
		if (phoneNumber.length() > 10) {
			System.out.println("Invalid number");
		} else {
			System.out.println("Valid number");
		}
		scanner.close();
	}
}
