package com.inheritance;

public class HierarachicalChild1 extends HierarchicalParent {
	private void sample() {
		System.out.println("This is from child 1");
	}
	public static void main(String[] args) {
		HierarachicalChild1 h = new HierarachicalChild1();
	h.sample();
	h.nativeName();
	h.nativePinCode();
	}
}
