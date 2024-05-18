package com.task.eight;

import java.util.Map;
import java.util.HashMap;

public class CreationMap {
	public static void main(String[] args) {
		Map<String, String> List = new HashMap<>();
		List.put("Selenium", "Java");
		List.put("bat", "oracle");
		List.put("cat", "framework");
		List.put("dog", "CoreJava");
		List.put("fish", "Jira");
		System.out.println(List);
	}
}
