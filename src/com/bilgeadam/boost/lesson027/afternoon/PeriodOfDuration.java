package com.bilgeadam.boost.lesson027.afternoon;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodOfDuration {

	public static void main(String[] args) {
		
		//Period Example
		Period examplePeriod = Period.of(30, 07, 18);
		System.out.println(examplePeriod);
		
		LocalDate localDate = LocalDate.now().plus(examplePeriod);
		System.out.println(localDate);
		
		
		//Duration Example
		Duration exampleDuration = Duration.ofHours(5);
		System.out.println(exampleDuration);
		
		LocalTime localTime =LocalTime.now().plus(exampleDuration);
		System.out.println(localTime);
		
		
	}

}
