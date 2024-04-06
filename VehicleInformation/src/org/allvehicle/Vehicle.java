package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	private void vehicleNessacary() {
		System.out.println("All Vehicle List : ");
		System.out.println("");
	}

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.vehicleNessacary();
		System.out.println("Two Wheeler : ");
		TwoWheeler t = new TwoWheeler();
		t.bike();
		t.cycle();
		System.out.println("Three Wheeler : ");
		ThreeWheeler w = new ThreeWheeler();
		w.auto();
		System.out.println("Four Wheeler : ");
		FourWheeler f = new FourWheeler();
		f.bus();
		f.car();
	}
}
