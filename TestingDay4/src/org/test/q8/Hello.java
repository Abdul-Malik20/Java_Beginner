package org.test.q8;

public class Hello {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = i + 1; j <= i; j++) {
				System.out.println(j);
			}
		}
	}
}

//Since the inner loop never executes, there will be no output produced by the "System.out.println(j)" statement.

//Thus, the output of this code will be nothing; it will produce no output.