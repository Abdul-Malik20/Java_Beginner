package org.college;

public class College {
	private void collegeName() {
		System.out.println("College Name : MSAJCE ");
	}

	private void collegeCode() {
		System.out.println("College Code : 3118");
	}

	private void collegeRank() {
		System.out.println("Rank : 39 ");
	}

	public static void main(String[] args) {
		College c = new College();
		Student s = new Student();
		Hostel  h = new Hostel();
		Dept d = new Dept();
		
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		
		s.studentName();
		s.studentId();
		s.studentDept();
		
		h.hostelName();
		
		d.deptName();
	}

}
