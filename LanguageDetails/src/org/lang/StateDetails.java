package org.lang;

public class StateDetails {
	private void southIndia() {
		System.out.println("South India ");
	}

	private void northIndia() {
		System.out.println("North India ");
	}
	
	public static void main(String[] args) {
		
		StateDetails s = new StateDetails();
		LanguageInfo l = new LanguageInfo();
		
		System.out.println("State Details : ");
		s.southIndia();
		s.northIndia();
		System.out.println("-----------------");
		System.out.println("Language Details : ");
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
	}
}
