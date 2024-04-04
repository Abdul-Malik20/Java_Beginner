package com.details;

public class MyDetails {
	public static void main(String[] args) {
		System.out.println("Bio Data");
		System.out.println("--------");

		String name = "J ABDUL MALIK";
		byte age = 19;
		String dob = "20/06/2004";
		long phNo = 7904941024l;
		String mail = "j.abdmalik20@gmail.com";
		long regNo = 311821105001l;
		String deptName = " ELECTRICAL AND ELECTRONICS ENGINEERING";
		short collegeCode = 3118;
		short passOut = 2025;
		int collegeId = 232323232;
		String aboutMe = "Motivated third-year EEE student aspiring to launch a career as a Full Stack Web Developer,\r\n"
				+ "specializing in the MERN stack. Eager to apply theoretical knowledge and learn new skills to\r\n"
				+ "contribute effectively as a fresher in the industry. Committed to delivering high-quality, userfriendly web solutions.\r\n"
				+ "";
		float cgpa = 7.89f;
		double hscMark = 513.47;
		boolean accept = true;

		System.out.println("NAME : " + name);
		System.out.println("AGE : " + age);
		System.out.println("DOB : " + dob);
		System.out.println("Phone Number : " + phNo);
		System.out.println("Email ID : " + mail);
		System.out.println("Register Number : " + regNo);
		System.out.println("Department : " + deptName);
		System.out.println("College Code : " + collegeCode);
		System.out.println("Passing Year :" + passOut);
		System.out.println("College ID : " + collegeId);
		System.out.println("");
		System.out.println("About Me : " + aboutMe);
		System.out.println("CGPA ( Till 4th Sem ) : " + cgpa);
		System.out.println("HSC Mark : " + hscMark);
		System.out.println("");
		System.out.println("The above informations are " + accept);

	}
}
