package com.task;

public class ArrayAverage {
    public static void main(String[] args) {
        // Input array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Variable to store the sum
        int sum = 0;
        
        // Calculate sum of array elements
        for (int num : array) {
            sum += num;
        }
        
        // Calculate the average
        double average =  sum / array.length;
        
        // Print the average
        System.out.println("Average of the array elements: " + average);
    }
}

