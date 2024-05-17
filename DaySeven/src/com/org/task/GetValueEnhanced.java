package com.org.task;

import java.util.Set;
import java.util.HashSet;

public class GetValueEnhanced {
	public static void main(String[] args) {
		Set<Integer> List = new HashSet<>();
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
		System.out.println("Iterate Values using Enhanced for Loop");
		for (Integer i : List) {
			System.out.println(i);
		}
	}
}
