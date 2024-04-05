package org.bank;

public class AxisBank extends BankInfo {
	private void deposit() {
		System.out.println("Deposit : 2000");
	}
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.saving();
		a.fixed();
		a.deposit();
	}
}
