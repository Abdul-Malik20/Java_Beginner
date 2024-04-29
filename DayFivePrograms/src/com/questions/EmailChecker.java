package com.questions;

import java.util.Scanner;

public class EmailChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your email id : ");
		String email = scanner.nextLine();
		if (email.contains("gmail")) {
			String modifiedEmail = email.replace("gmail", "yahoo");
			System.out.println("Modified email: " + modifiedEmail);
		} else {
			System.out.println("This is not valid email");
		}
		scanner.close();

	}
}
