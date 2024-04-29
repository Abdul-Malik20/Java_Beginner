package com.questions;

public class IndexFindings {
	public static void main(String[] args) {

// 1
		String s = "welcometojava";

		int lastIndexOf = s.lastIndexOf("e");

		System.out.println(s + " : " + lastIndexOf);

// 2
		String s1 = "SeleniumAutomationtool";

		int indexOf = s1.indexOf("m");

		System.out.println(s1 + " : " + indexOf);

// 3
		String s2 = "theatre";

		int indexOf2 = s2.indexOf("t");

		System.out.println(s2 + " : " + indexOf2);

// 4
		String s3 = "j a v a p r o g r a m";

		int lastIndexOf2 = s3.lastIndexOf(" ");

		System.out.println(s3 + " : " + lastIndexOf2);

// 5
		String s4 = "9876543210";

		int indexOf3 = s4.indexOf("8");

		System.out.println(s4 + " : " + indexOf3);
	}
}
