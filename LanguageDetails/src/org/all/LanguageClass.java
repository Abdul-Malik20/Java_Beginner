package org.all;

import org.english.English;

public class LanguageClass extends English {
	private void allLang() {
		System.out.println("All Languages");
	}
	public static void main(String[] args) {
		LanguageClass l = new LanguageClass();
		
		l.englishLang();
		l.tamilLang();
		l.telunguLang();
	}
}
