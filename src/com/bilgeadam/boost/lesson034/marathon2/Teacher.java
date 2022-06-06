package com.bilgeadam.boost.lesson034.marathon2;

import java.time.LocalDate;

public class Teacher extends Employee {
	private static int ACT_NUMBER = 0;

	public Teacher(String firstName, String lastName, String gender, boolean isMarried, LocalDate birthDate,
			LocalDate startDate, double startSalary) {
		super(firstName, lastName, gender, isMarried, birthDate, startDate, startSalary);
		
	}
	
	public Teacher(String firstName,String middleName, String lastName, String gender, boolean isMarried, LocalDate birthDate,
			LocalDate startDate, double startSalary) {
		super(firstName, middleName, lastName, gender, isMarried, birthDate, startDate, startSalary);
		
	}

	@Override
	public String createIDNumber() {
		Teacher.ACT_NUMBER++;
		String numAsString = String.format("T-%03d", Teacher.ACT_NUMBER);
		return numAsString;
	}

}
