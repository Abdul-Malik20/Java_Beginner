package com.task;

import java.util.ArrayList;
import java.util.Collections;

public class ReplaceValueInList {
	public static void main(String[] args) {
		// Input list
		ArrayList<Integer> list = new ArrayList<>();
		// Add values to the list
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		list.add(700);

		// Replace the value 300 with 350
		int oldValue = 300;
		int newValue = 350;
		if (list.contains(oldValue)) {
			Collections.replaceAll(list, oldValue, newValue);
			System.out.println("Replaced " + oldValue + " with " + newValue);
		} else {
			System.out.println("Value " + oldValue + " not found in the list.");
		}

		// Print the updated list
		System.out.println("Updated list: " + list);
	}
}
