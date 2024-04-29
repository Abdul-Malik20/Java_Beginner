package com.questions;

import java.util.Scanner;

public class StartsWithChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		boolean startsWithWelcome = input.isEmpty();
		System.out.println(startsWithWelcome);
		scanner.close();
	}
}
