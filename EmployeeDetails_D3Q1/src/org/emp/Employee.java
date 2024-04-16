package org.emp;

public class Employee {

	public void empId() {
		System.out.println("No employee ID provided.");
	}
	public void empId(int id) {
		System.out.println("Employee ID: " + id);
	}
	public void empId(String id) {
		System.out.println("Employee ID: " + id);
	}
	public void empId(int id, String name) {
		System.out.println("Employee ID: " + id + ", Name: " + name);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();

		emp.empId();
		emp.empId(1001);
		emp.empId("E123");
		emp.empId(1002, "John");s
	}
}
