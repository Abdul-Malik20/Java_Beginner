package org.phone;

public class PhoneInfo {
	
	private void phoneName() {
		System.out.println("Phone Name : IPhone - 14 ");
	}

	private void phoneMeieNum() {
		System.out.println("31877653456765");
	}

	private void camera() {
		System.out.println("Rear : 5MB /n Back : 10MB");
	}

	private void storage() {
		System.out.println("Storage : 256GB ");
	}

	private void osName() {
		System.out.println("OS Name : macOS");
	}
	public static void main(String[] args) {
		
		PhoneInfo i = new PhoneInfo();
		
		i.phoneName();
		i.phoneMeieNum();
		i.camera();
		i.storage();
		i.osName();
	}
}
