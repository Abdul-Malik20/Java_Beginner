package org.bank;

public class BankInfo {
	private void fullName() {
		System.out.println("Bank Holder : Jennath Firdous N");
	}

	private void sortCode() {
		System.out.println("Sort Number : 12345");
	}

	private void accountNumber() {
		System.out.println("Acoount Number : 311821105001");
	}

	private void bankAddress() {
		System.out.println("Bank Address : Sivagangai 630561");
	}

	public static void main(String[] args) {
		BankInfo b = new BankInfo();
		b.fullName();
		b.sortCode();
		b.accountNumber();
		b.bankAddress();
	}
}
