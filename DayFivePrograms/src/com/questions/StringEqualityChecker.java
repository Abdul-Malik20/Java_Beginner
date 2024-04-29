package com.questions;
import java.util.Scanner;

public class StringEqualityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input strings from the user
        System.out.print("String 1: ");
        String string1 = scanner.nextLine();

        System.out.print("String 2: ");
        String string2 = scanner.nextLine();

        // Check equality using equalsIgnoreCase
        if (string1.equalsIgnoreCase(string2)) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are Not Equal");
        }

        scanner.close();
    }
}
