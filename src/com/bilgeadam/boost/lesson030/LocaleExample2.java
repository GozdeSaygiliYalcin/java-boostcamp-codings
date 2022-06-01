package com.bilgeadam.boost.lesson030;

import java.util.Locale;

public class LocaleExample2 {

	public static void main(String[] args) {
		
		Locale enLocale = new Locale("en", "US");
		Locale esLocale = new Locale("es", "ES");
		
		System.out.println("English in english: " + enLocale.getDisplayLanguage());
		

	}

}
