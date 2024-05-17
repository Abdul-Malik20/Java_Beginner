package com.task.eight;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Iteration {
	public static void main(String[] args) {
		Map<Character, Integer> mp = new TreeMap<>();
		mp.put('!', 10);
		mp.put('@', 20);
		mp.put('#', 30);
		mp.put('$', 40);
		mp.put('^', 50);
		Set<Entry<Character, Integer>> values = mp.entrySet();
		for (Entry<Character, Integer> entry : values) {
			System.out.println(entry);
		}
	}
}
