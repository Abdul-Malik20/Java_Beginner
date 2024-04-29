package com.questions;

import java.util.Scanner;

public class GetInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String : ");
		String s1 = scanner.nextLine();
		System.out.println("ENter Second String : ");
		String s2 = scanner.nextLine();
		
		System.out.println("String 1 : " + s1 );
		System.out.println("String 2 : " + s2);
		scanner.close();
	}
}
