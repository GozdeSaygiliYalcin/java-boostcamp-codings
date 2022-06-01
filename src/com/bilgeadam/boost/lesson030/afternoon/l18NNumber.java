package com.bilgeadam.boost.lesson030.afternoon;

import java.text.NumberFormat;
import java.util.Locale;

public class l18NNumber {

	public static void main(String[] args) {
		
		printNumber(Locale.UK);
		printNumber(Locale.US);
		printNumber(Locale.FRANCE);
		printNumber(Locale.JAPAN);
	}

	static void printNumber(Locale locale) {
		
		double dbl =15053.322;
		
		NumberFormat formatter = NumberFormat.getNumberInstance(locale);
		String number = formatter.format(dbl);
		System.out.println(number +" " + locale);
		
	}
}
