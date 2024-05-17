package com.org.task;

public class UserDefineSet {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		String name = s.nextLine();
		System.out.println("Enter your ID : ");
		short id = s.nextShort();
		System.out.println("Enter your Phone : ");
		int phone = s.nextInt();
		System.out.println("Enter your Native : ");
		String district = s.nextLine();
		System.out.println("Enter your DOB : ");
		String dob = s.nextLine();
		System.out.println("Enter your email : ");
		String email = s.nextLine();
		
		
		
		s.close();
	}
}