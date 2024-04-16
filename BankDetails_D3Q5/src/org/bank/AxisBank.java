package org.bank;

public class AxisBank extends BankInfo {

	// Overriding the deposit method for AxisBank
	@Override
	public void deposit() {
		System.out.println("Deposit money in Axis Bank account.");
	}

	// Main method for testing
	public static void main(String[] args) {
		AxisBank axisBank = new AxisBank();

		// Testing overridden version of deposit() method
		axisBank.deposit(); // This will call the overridden method in AxisBank class
		axisBank.fixed();
		axisBank.saving();
	}
}