package com.inheritance;

public class MultiLevelInheritanceChild extends MultiLevelInheritanceP2 {
	private void collegeAddress() {
		System.out.println("Adress : Siruseri");
	}

	public static void main(String[] args) {
		MultiLevelInheritanceChild m = new MultiLevelInheritanceChild();
		m.collegeCode();
		m.collegeName();
		m.collegeAddress();
	}
}
