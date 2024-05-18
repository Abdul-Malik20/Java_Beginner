package com.questions;

public class ParticularFindings {
	public static void main(String[] args) {
//1
		
		String s1 = "SoftwareTestEngineer";
		int indexOf = s1.indexOf("e");
		System.out.println("Question 1 : "+s1.charAt(indexOf));

//2
		String s2 = "SeleniumAutomationtool";
		int indexOf1 = s2.indexOf("o");
		System.out.println("Question 2 : "+s2.charAt(indexOf1));
		
//3
		String s3 = "Goodmorning";
		int indexOf2 = s3.indexOf("o");
		System.out.println("Question 3 : "+s3.charAt(indexOf2));
		
//4
		String s4 = "j a v a p r o g r a m";
		int indexOf3 = s4.indexOf("p");
		System.out.println("Question 4 : "+s4.charAt(indexOf3));
		
//5
		String s5 = "9876543210";
		int indexOf4 = s5.indexOf("7");
		System.out.println("Question 5 : "+s5.charAt(indexOf4));
	}
}
