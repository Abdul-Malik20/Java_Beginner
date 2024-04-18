package org.check;

public class Main {
    public static void main(String[] args) {
        // C implements I
        System.out.println("C implements I is true");

        // C implements C
        System.out.println("C implements C is false");

        // C implements A
        System.out.println("C implements A is false");

        // C extends I
        System.out.println("C extends I is false");

        // C extends C
        System.out.println("C extends C is true");

        // C extends A
        System.out.println("C extends A is false");

        // I implements I
        System.out.println("I implements I is true");

        // I implements C
        System.out.println("I implements C is false");

        // I implements A
        System.out.println("I implements A is false");

        // I extends I
        System.out.println("I extends I is false");

        // I extends C
        System.out.println("I extends C is false");

        // I extends A
        System.out.println("I extends A is false");

        // A implements I
        System.out.println("A implements I is false");

        // A implements C
        System.out.println("A implements C is false");

        // A implements A
        System.out.println("A implements A is false");

        // A extends I
        System.out.println("A extends I is false");

        // A extends C
        System.out.println("A extends C is false");

        // A extends A
        System.out.println("A extends A is false");
    }
}