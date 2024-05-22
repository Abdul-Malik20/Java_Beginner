package com.org.task;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EmployeeMain {
	public static void main(String[] args) {
		// Create a Set to store employee details
		Set<Employee> employeeSet = new HashSet<>();
		Scanner scanner = new Scanner(System.in);

		// Input 5 employee details from the user
		for (int i = 0; i < 5; i++) {
			Employee employee = new Employee();
			System.out.println("Enter details for Employee " + (i + 1) + ":");

			System.out.print("Enter Employee ID: ");
			employee.setEmpId(scanner.nextInt());
			scanner.nextLine(); // Consume newline

			System.out.print("Enter Name: ");
			employee.setName(scanner.nextLine());

			System.out.print("Enter Phone: ");
			employee.setPhone(scanner.nextLine());

			System.out.print("Enter Address: ");
			employee.setAddress(scanner.nextLine());

			System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
			employee.setDob(scanner.nextLine());

			System.out.print("Enter Date of Joining (YYYY-MM-DD): ");
			employee.setDoj(scanner.nextLine());

			System.out.print("Enter Email: ");
			employee.seteMail(scanner.nextLine());

			System.out.print("Enter Gender: ");
			employee.setGender(scanner.nextLine());

			System.out.print("Enter Salary: ");
			employee.setSal(scanner.nextDouble());
			scanner.nextLine(); // Consume newline

			// Add the employee to the set
			employeeSet.add(employee);
		}

		
		scanner.close();

		// Display the employee details
		System.out.println("\nEmployee Details:");
		for (Employee employee : employeeSet) {
			System.out.println("Employee ID : " + employee.getEmpId());
			System.out.println(employee.getName());
			System.out.println(employee.getGender());
			System.out.println(employee.getDob());
			System.out.println(employee.getDoj());
			System.out.println(employee.getSal());
			System.out.println(employee.geteMail());
		}
	}
}
