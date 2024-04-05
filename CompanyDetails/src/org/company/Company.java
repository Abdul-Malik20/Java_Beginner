package org.company;

import org.client.Client;

public class Company extends Client {
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
		
		c.clientName();
	}

}
