package org.test.q10;

public class Hello {
	public static void main(String[] args) {
		for (int i = 5; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}
}