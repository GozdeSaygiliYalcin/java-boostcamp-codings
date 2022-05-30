package com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.employees;

import java.time.LocalDate;

import com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.model.Gender;

public class Teacher extends Employee {
	
	private static int counterTeacher;
	private static final double WAGE_INCREASE = 0.1;

	public Teacher(String firstName, String middleName, String lastName, Gender gender, LocalDate birthDate,
			LocalDate startDate, LocalDate finishDate, boolean marriedStatus, int homeNumber, int mobileNumber,
			String id, double salary) {
		super(firstName, middleName, lastName, gender, birthDate, startDate, finishDate, marriedStatus, homeNumber,
				mobileNumber, id, salary);
		this.id = getRegsNumber();
		
	}
	
	public Teacher(String firstName, String lastName, Gender gender, LocalDate birthDate,
			LocalDate startDate, LocalDate finishDate, boolean marriedStatus, int homeNumber, int mobileNumber,
			String id, double salary) {
		super(firstName, lastName, gender, birthDate, startDate, finishDate, marriedStatus, homeNumber,
				mobileNumber, id, salary);
		this.id = getRegsNumber();
	}

	@Override
	public double getSalary() {
		this.salary = salary + (WAGE_INCREASE*salary);
		return this.salary;
	}

	
	@Override
	public String toString() {
		return "Teacher [=" + super.toString() + "]";
	}

	@Override
	public String getRegsNumber() {
		String num = String.format("%03d", ++counterTeacher);
		return "T-" + num;
	}
	
}
