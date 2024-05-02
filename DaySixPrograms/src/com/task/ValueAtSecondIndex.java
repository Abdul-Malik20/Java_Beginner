package com.task;

import java.util.ArrayList;

public class ValueAtSecondIndex {
    public static void main(String[] args) {
        // Input list
        ArrayList<Integer> list = new ArrayList<>();
        // Add some values to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        
        // Get the value at the 2nd index
        int value = list.get(2); // Indexing starts from 0
        
        // Print the value
        System.out.println("Value at the 2nd index: " + value);
    }
}

