package com.bilgeadam.boost.lesson030.afternoon;


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class l18NDate {

	public static void main(String[] args) {
		
		printDate(Locale.UK);
		printDate(Locale.US);

	}
	
	static void printDate(Locale locale) {
		
		DateFormat formatter = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		Date currentDate = new Date();
		String time = formatter.format(currentDate);
		System.out.println(time + " "  + locale);
		
	}

}
