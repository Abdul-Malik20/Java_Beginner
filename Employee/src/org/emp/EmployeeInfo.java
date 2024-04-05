package org.emp;

public class EmployeeInfo {
	
	//Method Creation
	private void empId() {
		System.out.println("Employee Id : 3118");
	}

	private void empName() {
		System.out.println("Employee Name : J Abdul Malik");
	}

	private void empDob() {
		System.out.println("Employee DOB :20/06/2004");
	}

	private void empPhone() {
		System.out.println("Employee Phone : +91 7904941024");
	}

	private void empEmail() {
		System.out.println("Employee Email : j.abdmalik20@gmail.com");
	}

	private void empAddress() {
		System.out.println("Employee Address : ");
		System.out.println("Native : Sivagangai");
		System.out.println("Live in : Chennai ");
	}
	
	//Object Creation
	public static void main(String[] args) {
		EmployeeInfo e = new EmployeeInfo();
		e.empId();
		e.empName();
		e.empDob();
		e.empEmail();
		e.empPhone();
		e.empAddress();
	}
}
