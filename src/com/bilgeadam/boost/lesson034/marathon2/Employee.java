package com.bilgeadam.boost.lesson034.marathon2;

import java.time.LocalDate;

public abstract class Employee extends Person {
	
	private String idNumber;
	private LocalDate startDate;
	private LocalDate endDate;
	private double startSalary;
	private String[] telephoneNumbers;
	

	public Employee(String firstName, String lastName, String gender, boolean isMarried, LocalDate birthDate,
			LocalDate startDate, double startSalary) {
		super(firstName, lastName, gender, isMarried, birthDate);
		this.startDate = startDate;
		this.startSalary = startSalary;
		this.endDate = null;
		
	}
	
	public Employee(String firstName, String middleName, String lastName, String gender, boolean isMarried, LocalDate birthDate,
			LocalDate startDate, double startSalary) {
		super(firstName, lastName, gender, isMarried, birthDate);
		this.startDate = startDate;
		this.startSalary = startSalary;
		this.endDate = null;
		this.idNumber = this.createIDNumber();
		
	}

	public abstract String createIDNumber();

	public LocalDate getStartDate() {
		return this.startDate;
	}


	public LocalDate getEndDate() {
		return this.endDate;
	}


	public double getStartSalary() {
		return this.startSalary;
	}


	public void setStartSalary(double startSalary) {
		this.startSalary = startSalary;
	}


	public String[] getTelephoneNumbers() {
		return this.telephoneNumbers;
	}

	public void setHomeTelephone(String telephone) {
		this.telephoneNumbers[Commons.HOME] = telephone;
	}


	public void setGSMTelephone(String telephone) {
		this.telephoneNumbers[Commons.GSM] = telephone;
	}

}
