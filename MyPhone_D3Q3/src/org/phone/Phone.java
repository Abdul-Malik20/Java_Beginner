package org.phone;

public class Phone {

	public void phoneInfo(String brand, int model) {
		System.out.println("Phone Brand: " + brand + ", Model: " + model);
	}

	public void phoneInfo(int model, String brand) {
		System.out.println("Phone Model: " + model + ", Brand: " + brand);
	}

	// Main method for testing
	public static void main(String[] args) {
		Phone myPhone = new Phone();

		myPhone.phoneInfo("Samsung", 2020); // String, int order
		myPhone.phoneInfo(2021, "Apple"); // int, String order
	}
}
