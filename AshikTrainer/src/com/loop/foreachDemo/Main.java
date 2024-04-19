package com.loop.foreachDemo;

public class Main {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // Using an enhanced for loop to print elements of the array in reverse order
        for (int i = cars.length - 1; i >= 0; i--) {
            System.out.println(cars[i]);
        }
    }
}
