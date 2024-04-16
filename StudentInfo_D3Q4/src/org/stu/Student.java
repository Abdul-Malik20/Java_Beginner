package org.stu;

public class Student {

	// Overloaded studentId() method with order: type, number
	public void studentId(String idType, int idNumber) {
		System.out.println("Student ID Type: " + idType + ", Number: " + idNumber);
	}

	// Overloaded studentId() method with order: number, type
	public void studentId(int idNumber, String idType) {
		System.out.println("Student ID Number: " + idNumber + ", Type: " + idType);
	}

	// Overloaded studentId() method with type: String
	public void studentId(String id) {
		System.out.println("Student ID: " + id);
	}

	// Overloaded studentId() method with type: int
	public void studentId(int id) {
		System.out.println("Student ID: " + id);
	}

	// Main method for testing
	public static void main(String[] args) {
		Student student = new Student();

		// Testing different overloaded versions of studentId() method
		student.studentId("Roll", 101); // type, number order
		student.studentId(202, "Admission"); // number, type order
		student.studentId("S001"); // String type
		student.studentId(102); // int type
	}
}
