package com.bilgeadam.boost.lesson030.afternoon;

import java.util.Locale;

public class DefaultLocale {
	
	public static void main(String[] args) {
		Locale locale = new Locale("fr", "FR");
		
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getISO3Country());
		System.out.println(locale.getISO3Language());
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
	
		
	}
	




}
