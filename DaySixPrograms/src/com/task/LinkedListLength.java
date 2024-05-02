package com.task;

import java.util.LinkedList;

public class LinkedListLength {
	public static void main(String[] args) {
		// Create a new LinkedList with values
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		list.add(700);

		// Find the length of the LinkedList
		int length = list.size();

		// Print the length
		System.out.println("Length of the LinkedList: " + length);
	}
}
