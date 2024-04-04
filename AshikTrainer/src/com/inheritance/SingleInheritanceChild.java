package com.inheritance;

public class SingleInheritanceChild extends SingleInheritanceParent {
	private void companyInfo() {
		System.out.println("Company Name : Deloitte");
	}

	public static void main(String[] args) {
		SingleInheritanceChild s = new SingleInheritanceChild();
		s.companyInfo();
		s.employeeName();
		s.employeeId();
	}
}
