package com.task;

import java.util.ArrayList;

public class RemoveAllValues {
    public static void main(String[] args) {
        // Input lists
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(90);
        list1.add(10);
        list1.add(10);
        list1.add(40);
        list1.add(50);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.add(80);
        
        // Perform removeAll operation
        list1.removeAll(list2);
        
        // Print the updated list1
        System.out.println("List1 after removing common values with list2: " + list1);
    }
}

