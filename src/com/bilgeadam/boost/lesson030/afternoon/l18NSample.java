package com.bilgeadam.boost.lesson030.afternoon;

import java.util.Locale;
import java.util.ResourceBundle;

public class l18NSample {

	public static void main(String[] args) {
		
		String language;
		String country;
		 
		if(args.length != 2) {
			language = new String("de");
			country = new String("DE");
		} 
		else {
			language =new String(args[0]) ;
			country = new String(args[1]);
		}
		
		Locale currentLocale = new Locale(language, country);
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		
		System.out.println("greetings");
		System.out.println("farewall");
		System.out.println("inquiry");
	}

}
