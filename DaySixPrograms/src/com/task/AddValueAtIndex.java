package com.task;

import java.util.ArrayList;

public class AddValueAtIndex {
    public static void main(String[] args) {
        // Input list
        ArrayList<Integer> list = new ArrayList<>();
        // Add values to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(90);
        list.add(10);
        list.add(10);
        list.add(40);
        
        // Add a value (50) at the 2nd index
        list.add(70); // Indexing starts from 0
        
        // Print the updated list
        System.out.println("Updated list after adding 50 at the end index: " + list);
    }
}

