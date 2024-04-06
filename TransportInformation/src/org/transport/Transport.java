package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	private void transportForm() {
		System.out.println("All Transport Details");
		System.out.println("-----------------------");
	}

	public static void main(String[] args) {
		Transport t = new Transport();
		t.transportForm();

		Road r = new Road();
		r.auto();
		r.bike();
		r.bus();
		r.car();
		r.auto();
		r.cycle();

		Water w = new Water();
		w.ship();

		Air a = new Air();
		a.aeroPlane();
	}
}
