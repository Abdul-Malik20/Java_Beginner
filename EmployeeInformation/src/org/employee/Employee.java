package org.employee;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	private void employeeName() {
		System.out.println("Employee Name : Malik");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.employeeName();
		Company c = new Company();
		c.companyName();
		Client t = new Client();
		t.clientName();
		Project p = new Project();
	}
}
