package com.org.task;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListToSet {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(90);
		list.add(100);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		System.out.println("List " + list);
		
		Set<Integer> setList = new HashSet<>();
		setList.addAll(list);
		
		System.out.println("List to Set " + setList);
	}
}
