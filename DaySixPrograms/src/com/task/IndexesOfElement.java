package com.task;

import java.util.ArrayList;

public class IndexesOfElement {
    public static void main(String[] args) {
        // Input list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(90);
        list.add(10);
        list.add(10);
        list.add(40);
        list.add(50);
        list.add(10);
        
        // Find and print each index value of 10
         for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 10) {
                System.out.println("Index value of 10: " + i);
            }
        }
    }
}
