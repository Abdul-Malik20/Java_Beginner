package com.questions;

import java.util.Scanner;

public class UppercaseConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String input = scanner.nextLine();
		String lowercaseWord = input.toUpperCase();
		System.out.println("Output: " + lowercaseWord);
		scanner.close();
	}
}
