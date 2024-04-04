package org.info;

import com.msajce.FacultyDetails;
import com.msajce.StudentDetails;

public class OrgDetails {
	public static void main(String[] args) {
		System.out.println("Welcome - MSAJCE");
		System.out.println("Faculty Details : ");
		System.out.println("------------------");
		FacultyDetails f = new FacultyDetails();
		f.eeeFaculty();
		f.cseFaculty();
		System.out.println("****************");
		System.out.println("Student Deatils : ");
		System.out.println("------------------");
		StudentDetails s = new StudentDetails();
		s.eeeStudent();
		s.cseStudent();
	}
}
