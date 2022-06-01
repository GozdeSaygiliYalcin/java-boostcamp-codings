package com.bilgeadam.boost.lesson030.afternoon;

import java.text.NumberFormat;
import java.util.Locale;

public class l18NLCurrency {
	
	public static void main(String[] args) {
		
		printCurrency(Locale.UK);
		printCurrency(Locale.US);
		printCurrency(Locale.FRANCE);
		printCurrency(Locale.JAPAN);
		
	}
	static void printCurrency(Locale locale) {
			
		double dbl =15053.322;
			
		NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
		String currency = formatter.format(dbl);
		System.out.println(currency +" " + locale);
		
		}
	
	
}
