package com.task;

import java.util.ArrayList;

public class IterateListUsingForLoop {
    public static void main(String[] args) {
        // Input list
        ArrayList<Integer> list = new ArrayList<>();
        // Add values to the list
        list.add(105);
        list.add(205);
        list.add(305);
        list.add(405);
        list.add(505);
        list.add(605);
        list.add(705);
        list.add(805);
        
        // Iterate through the list using a normal for loop
        System.out.println("Values of the list:");
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            System.out.println(value);
        }
    }
}

