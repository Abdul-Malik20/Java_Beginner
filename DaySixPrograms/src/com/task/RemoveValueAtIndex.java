package com.task;

import java.util.ArrayList;

public class RemoveValueAtIndex {
    public static void main(String[] args) {
        // Input list
        ArrayList<Integer> list = new ArrayList<>();
        // Add some values to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        
        // Remove the value at the 2nd index
        int removedValue = list.remove(2); // Indexing starts from 0
        
        // Print the removed value
        System.out.println("Removed value at the 2nd index: " + removedValue);
        
        // Print the updated list
        System.out.println("Updated list after removal: " + list);
    }
}

