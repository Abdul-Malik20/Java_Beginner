package com.inheritance;

public class HeirarchicalChild2 extends HierarchicalParent {
	private void sample() {
		System.out.println("This is from Child 2");
	}

	public static void main(String[] args) {
		HeirarchicalChild2 r = new HeirarchicalChild2();
		r.sample();
		r.nativeName();
		r.nativePinCode();
	}
}
