package com.bilgeadam.boost.lesson027.afternoon;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateAndLocalTimeExamples {

	public static void main(String[] args) {
		// This class includes basic local date and time examples
		
		LocalDate currentLocalDate = LocalDate.now();
		
		System.out.println("Today: " + currentLocalDate);
		
		LocalDate ld27022017 = LocalDate.of(2017, 2, 27);
		System.out.println(ld27022017);
		
		LocalDate fld27022017 = LocalDate.parse("2017-02-27", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		System.out.println(fld27022017);
		
		ld27022017 = ld27022017.plusDays(1);
		System.out.println(ld27022017);
		
		ld27022017 = ld27022017.minusDays(2);
		System.out.println(ld27022017);
		
		LocalTime currentLocalTime =LocalTime.now();
		System.out.println(currentLocalTime);
		
		LocalTime parseLocalTime = LocalTime.parse(("13:45"));
		System.out.println(parseLocalTime);
	}

}
