package com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.employees;

import java.time.LocalDate;

import com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.model.Gender;

public class Officer extends Employee {
	
	private static int counterOfficer;
	private static final double WAGE_INCREASE = 0.09;
	

	public Officer(String firstName, String middleName, String lastName, Gender gender, LocalDate birthDate,
			LocalDate startDate, LocalDate finishDate, boolean marriedStatus, int homeNumber, int mobileNumber,
			String id, double salary) {
		super(firstName, middleName, lastName, gender, birthDate, startDate, finishDate, marriedStatus, homeNumber,
				mobileNumber, id, salary);
		this.id = getRegsNumber();
		
	}
	
	public Officer(String firstName, String lastName, Gender gender, LocalDate birthDate,
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
	public String getRegsNumber() {

	String num = String.format("%03d", ++counterOfficer);
	return "O-" + num;

	}

	@Override
	public String toString() {
		return "Officer [=" + super.toString() + "]";
	}
	
	@Override
	public String toString2() {
		return "Officer [=" + super.toString2() + "]";
	}

}
