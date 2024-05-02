package com.task;

import java.util.Vector;

public class VectorLength {
    public static void main(String[] args) {
        // Create a new Vector with values
        Vector<Integer> vector = new Vector<>();
        vector.add(105);
        vector.add(205);
        vector.add(305);
        vector.add(405);
        vector.add(505);
        vector.add(605);
        vector.add(705);
        vector.add(805);
        
        // Find the length of the Vector
        int length = vector.size();
        
        // Print the length
        System.out.println("Length of the Vector: " + length);
    }
}
