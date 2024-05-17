package com.task;

import java.util.ArrayList;

public class FirstIndexOfElement { //last index also
    public static void main(String[] args) {
        // Input list
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(10);
        
        // Find the first index value of 10
        int firstIndex = list.indexOf(10);
        
        // Print the first index value
       
            System.out.println("First index value of 10: " + firstIndex);
        
           
    }
}

