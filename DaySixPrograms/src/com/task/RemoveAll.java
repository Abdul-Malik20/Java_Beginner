package com.task;

import java.util.ArrayList;

public class RemoveAll {
    public static void main(String[] args) {
        // Input lists
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        list1.add(70);
        list1.add(80);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.add(10);
        list2.add(400);
        list2.add(500);
        list2.add(600);
        list2.add(700);
        list2.add(8000);
        
        // Perform removeAll operation
        list2.removeAll(list1);
        
        // Print the updated list1
        System.out.println("List1 after removing common values with list2: " + list2);
    }
}
