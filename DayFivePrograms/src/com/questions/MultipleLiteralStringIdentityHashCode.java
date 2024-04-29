package com.questions;

public class MultipleLiteralStringIdentityHashCode {
    public static void main(String[] args) {
        // Generate three string literals
        String string1 = "java";
        String string2 = "program";
        String string3 = "java";

        // Find the identity hash codes
        int hash1 = System.identityHashCode(string1);
        int hash2 = System.identityHashCode(string2);
        int hash3 = System.identityHashCode(string3);

        // Print the identity hash codes
        System.out.println("String 1 identity hash code: " + hash1);
        System.out.println("String 2 identity hash code: " + hash2);
        System.out.println("String 3 identity hash code: " + hash3);
    }
}

