package org.test.q9;

public class Hello {
	public static void main(String[] args) {
		for (int i = 5; i <= 100; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
	}
}

//Given that the break statement executes when i equals 5, 
//the loop will exit without executing the System.out.println(i) statement.
//Therefore, the output of this code will be nothing; it will produce no output.