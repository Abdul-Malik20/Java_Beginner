package com.task;

import java.util.Set;
import java.util.TreeSet;

public class ArrayDupRem {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 10, 20, 30, 40, 60, 70, 11, 10 };
		Set<Integer> s = new TreeSet<>();
		for (int i : a) {
			s.add(i);
		}
		System.out.println("After Removing : "+s);
	}
}
