package org.computer;

public class Desktop implements Hardware, Software {
	private void desktop() {
		System.out.println("Desktop");
	}

	@Override
	public void softwareType() {
		System.out.println("Software : Windows OS ");
	}

	@Override
	public void hardwareType() {
		System.out.println("Hardware : intel ");
	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktop();
		d.softwareType();
		d.hardwareType();
	}
}
