package com.bilgeadam.boost.lesson027.afternoon;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthDayExample {

	public static void main(String[] args) {
		
		DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your birthday as dd.MM.yyyy");
		String askBirthDay = input.nextLine();
		
		LocalDate birthDate = LocalDate.parse(askBirthDay, inputFormat);
		
		if(birthDate.isAfter(LocalDate.now())) {
		System.err.println("Your birthday cannot be before current time!");
		
		}
		System.out.println(birthDate.format(inputFormat) + " is your birthday date");
		System.out.println(birthDate.getDayOfWeek() + " is the day you were born");
		
		long days = birthDate.until(LocalDate.now(), ChronoUnit.DAYS);
		long weeks = birthDate.until(LocalDate.now(), ChronoUnit.WEEKS);
		long months = birthDate.until(LocalDate.now(), ChronoUnit.MONTHS);
		long years = birthDate.until(LocalDate.now(), ChronoUnit.YEARS);
		 
		System.out.println("Until this time as DAYS " + days + " as WEEKS " + weeks +  " as MONTHS " + months + " as YEARS " + years + " you lived which was amazing");
		
		LocalDate nextBDate = birthDate.plusYears(years+1);
		System.out.println("Your next birthday will be: " + nextBDate.format(inputFormat));
	}

}
