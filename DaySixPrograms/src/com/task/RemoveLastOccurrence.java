package com.task;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveLastOccurrence {
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
        
        // Find the last index of the value to remove
        int lastIndex = list.lastIndexOf(10);
        
        // Remove the last occurrence of the value
        
            list.remove(lastIndex);
            System.out.println("Removed last occurrence of 10");
       
        System.out.println("Updated list: " + list);
    }
}

