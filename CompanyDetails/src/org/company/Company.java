package org.company;

public class Company {
	private void companyName() {
		System.out.println("Company Name : dotSculptor");
	}

	private void companyId() {
		System.out.println("Company ID : 2345");
	}

	private void companyAddress() {
		System.out.println("Company Address : Chennai - Sipcot , Siruseri");
	}

	public static void main(String[] args) {
		Company c = new Company();

		c.companyName();
		c.companyId();
		c.companyAddress();
	}

}
