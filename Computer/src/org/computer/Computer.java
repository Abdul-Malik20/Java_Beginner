package org.computer;

public class Computer extends Desktop {
	private void computerModel() {
		System.out.println("Model : Aspire 5 - Acer");
	}

	public static void main(String[] args) {
		Computer c = new Computer();

		c.computerModel();
		c.desktopSize();
	}
}
