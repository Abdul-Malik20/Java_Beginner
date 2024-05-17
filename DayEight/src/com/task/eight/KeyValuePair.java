package com.task.eight;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class KeyValuePair {
	public static void main(String[] args) {
		Map<String, String> mp = new LinkedHashMap<>();
		mp.put("malik", "svg");
		mp.put("aadil", "rmd");
		mp.put("hassan", "tnl");
		mp.put("basil", "kottur");
		mp.put("thameewm", "theni");
		Set<Entry<String, String>> values = mp.entrySet();
		for (Entry<String, String> entry : values) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
