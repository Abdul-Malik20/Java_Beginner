package com.org.task;

import java.util.HashSet;
import java.util.Set;

public class CreationHashSet {
	public static void main(String[] args) {
		Set<Integer> List = new HashSet();
		List.add(10);
		List.add(20);
		List.add(90);
		List.add(100);
		List.add(10);
		List.add(20);
		List.add(30);
		List.add(40);
		List.add(50);
		List.add(60);

		System.out.println("HashSet " + List);
	}
}
