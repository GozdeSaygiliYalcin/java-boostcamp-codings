package com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.employees;

import java.time.LocalDate;

import com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.model.Gender;

public class Janitor extends Employee {
	
	private static int counterJanitor;
	private static final double WAGE_INCREASE = 0.085;
	
	public Janitor(String firstName, String middleName, String lastName, Gender gender, LocalDate birthDate,
			LocalDate startDate, LocalDate finishDate, boolean marriedStatus, long homeNumber, long mobileNumber,
			String id, double salary) {
		super(firstName, middleName, lastName, gender, birthDate, startDate, finishDate, marriedStatus, homeNumber,
				mobileNumber, id, salary);
		this.id = getRegsNumber();
		
	}
	public Janitor(String firstName, String lastName, Gender gender, LocalDate birthDate,
			LocalDate startDate, LocalDate finishDate, boolean marriedStatus, long homeNumber, long mobileNumber,
			String id, double salary) {
		super(firstName,lastName, gender, birthDate, startDate, finishDate, marriedStatus, homeNumber,
				mobileNumber, id, salary);
		this.id = getRegsNumber();
	
	}
	
	public double getSalary() {
		this.salary = salary + (WAGE_INCREASE*salary);
		return this.salary;
	}
	
	
	@Override
	public String toString() {
		return "Janitor [" + super.toString() + "]";
	}
	@Override
	public String getRegsNumber() {
		String num = String.format("%03d", ++counterJanitor);
		return "J-" + num;
	}
	
}