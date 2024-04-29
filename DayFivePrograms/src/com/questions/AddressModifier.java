package com.questions;

import java.util.Scanner;

public class AddressModifier {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your address: ");
		String address = scanner.nextLine();
		if (address.contains("pincode")) {
			String modifiedAddress = address.replace("pincode", "");
			System.out.println("Modified address: " + modifiedAddress);
		} else {
			System.out.println("No modification needed. Address does not contain 'pincode'.");
		}
		scanner.close();
	}
}
