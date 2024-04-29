package com.questions;

import java.util.Scanner;

public class CheckWhether {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your mail id : ");
//		String email = scanner.nextLine();
//		if (email.contains("@")) {
//			System.out.println("Thank you for registering !");
//		} else {
//			System.out.println("Please enter valid email id ! ");
//		}
//		scanner.close();
//	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Address !");
		System.out.println("*********************");
		System.out.println("Enter your street name  : ");
		String street = scanner.nextLine();
		System.out.println("Enter your district name  : ");
		String district = scanner.nextLine();
		System.out.println("Enter your pincode no  : ");
		String pinCode = scanner.nextLine();
		if (pinCode.isEmpty()) {
			System.out.println("********************************");
			System.out.println("Please enter your valid pincode ");
			System.out.println("*********************************");
		} else {
			System.out.println("Address Saved !!");
			System.out.println(street + district + pinCode );
		}
	}
}