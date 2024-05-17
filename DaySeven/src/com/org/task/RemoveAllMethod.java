package com.org.task;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveAllMethod {
public static void main(String[] args) {
	Set<Integer> List1 = new LinkedHashSet<>();
	List1.add(10);
	List1.add(20);
	List1.add(30);
	List1.add(50);
	List1.add(10);
	List1.add(10);
	List1.add(40);
	
	Set<Integer> List2 = new LinkedHashSet<>();
	List2.add(100);
	List2.add(20);
	List2.add(30);
	List2.add(50);
	List2.add(40);
	List2.add(200);
	List2.add(900);
	
	List2.removeAll(List1);
	System.out.println("removeAll Method " + List2);
}
}
