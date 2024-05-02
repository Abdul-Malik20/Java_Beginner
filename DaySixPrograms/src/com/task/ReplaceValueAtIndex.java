package com.task;

import java.util.ArrayList;

public class ReplaceValueAtIndex {
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
        list.add(50);
        list.add(10);
        
        // Replace the value at the 7th index with 90
        int index = 6; // 7th index (indexing starts from 0)
        int newValue = 90;
        list.set(index, newValue);
        
        // Print the updated list
        System.out.println("Updated list after replacing value at 7th index with 90: " + list);
    }
}
