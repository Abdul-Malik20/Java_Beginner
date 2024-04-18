package org.bike;

public class Ktm implements Bike {
	// Implementing the cost() method defined in the Bike interface
	@Override
	public void cost() {
		System.out.println("KTM Cost is 1500000");
	}

	// Implementing the speed() method defined in the Bike interface
	@Override
	public void speed() {
		System.out.println("KTM Speed is 180 KM/hr");
	}

	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost();
		k.speed();
	}
}