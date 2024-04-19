package com.condt.switchDemo;

public class Main {
    public static void main(String[] args) {
        String fruit = "Apple";

        switch (fruit) {
            case "Apple":
                System.out.println("Selected fruit is Apple");
                break;
            case "Banana":
                System.out.println("Selected fruit is Banana");
                break;
            case "Orange":
                System.out.println("Selected fruit is Orange");
                break;
            default:
                System.out.println("Selected fruit is not in the list");
                break;
        }
    }
}
