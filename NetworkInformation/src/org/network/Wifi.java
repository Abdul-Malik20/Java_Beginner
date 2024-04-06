package org.network;

public class Wifi {
	private void wifiName() {
		System.out.println("All Network");
	}

	public static void main(String[] args) {
		Wifi w = new Wifi();
		w.wifiName();

		MobileData m = new MobileData();
		m.dataName();

		Lan l = new Lan();
		l.lanName();

		Wireless n = new Wireless();
		n.modamName();
	}
}
