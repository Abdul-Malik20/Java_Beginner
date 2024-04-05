package org.india;

import org.tamilnadu.TamilNadu;

public class India extends TamilNadu {
	private void india() {
		System.out.println("All State with Languages");
	}

	public static void main(String[] args) {
		India i = new India();

		i.india();
		i.tamil();
		i.malayalam();
		i.telungu();
	}
}
