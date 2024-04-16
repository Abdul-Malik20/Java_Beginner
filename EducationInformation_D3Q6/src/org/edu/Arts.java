package org.edu;

public class Arts extends Education {

	// Overriding the ug() method for Arts
	@Override
	public void ug() {
		System.out.println("Undergraduate education in Arts stream.");
	}

	// Overriding the pg() method for Arts
	@Override
	public void pg() {
		System.out.println("Postgraduate education in Arts stream.");
	}
	// Additional methods specific to Arts
	public void bSc() {
		System.out.println("Bachelor of Science in Arts.");
	}

	public void bEd() {
		System.out.println("Bachelor of Education in Arts.");
	}

	public void bA() {
		System.out.println("Bachelor of Arts.");
	}

	public void bBA() {
		System.out.println("Bachelor of Business Administration in Arts.");
	}

	// Main method for testing
	public static void main(String[] args) {
		Arts arts = new Arts();

		// Testing overridden versions of ug() and pg() methods
		arts.ug(); // This will call the overridden method in Arts class
		arts.pg(); // This will call the overridden method in Arts class
		arts.bA();
		arts.bBA();
		arts.bEd();
	}
}