package com.task.eight;

import java.util.LinkedHashMap;
import java.util.Map;

public class GetKeyValue {
	public static void main(String[] args) {
		Map<Integer, String> mp = new LinkedHashMap<>();
		mp.put(10, "Java");
		mp.put(20, "Core");
		mp.put(30, "apple");
		mp.put(40, "aadil");
		mp.put(50, "Malik");
		System.out.println(mp.values());
	}
}
