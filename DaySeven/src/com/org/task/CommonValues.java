package com.org.task;

import java.util.Set;
import java.util.TreeSet;

public class CommonValues {
	public static void main(String[] args) {
		Set<Integer> List1 = new TreeSet<>();
		List1.add(10);
		List1.add(20);
		List1.add(30);
		List1.add(50);
		List1.add(10);
		List1.add(10);
		List1.add(40);
		
		Set<Integer> List2 = new TreeSet<>();
		List2.add(100);
		List2.add(20);
		List2.add(30);
		List2.add(50);
		List2.add(40);
		List2.add(200);
		List2.add(900);
		
		System.out.println("List 1 :" + List1);
		System.out.println("List 2 : " + List2);
		
		List2.retainAll(List1);
		System.out.println("Common Values " + List2);
		
	}
}
