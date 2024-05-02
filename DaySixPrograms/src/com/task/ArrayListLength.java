package com.task;

import java.util.ArrayList;

public class ArrayListLength {
    public static void main(String[] args) {
        // Create a new ArrayList with values
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(90);
        list.add(10);
        list.add(10);
        list.add(40);
        list.add(50);
        
        // Find the length of the ArrayList
        int length = list.size();
        
        // Print the length
        System.out.println("Length of the ArrayList: " + length);
    }
}
