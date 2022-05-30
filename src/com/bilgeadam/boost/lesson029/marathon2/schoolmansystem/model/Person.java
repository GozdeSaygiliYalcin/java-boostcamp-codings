package com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.model;

import java.time.LocalDate;

public abstract class Person {
	

	private String firstName;
	private String middleName;
	private String lastName;
	private Gender gender;
	private LocalDate birthDate;
	protected LocalDate startDate;
	private LocalDate finishDate;
	private boolean marriedStatus;
	private long homeNumber;
	private long mobileNumber;
	
	
	public Person(String firstName, String middleName, String lastName, Gender gender, LocalDate birthDate,
			LocalDate startDate, LocalDate finishDate, boolean marriedStatus, long homeNumber, long mobileNumber) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.marriedStatus = marriedStatus;
		this.homeNumber = homeNumber;
		this.mobileNumber = mobileNumber;
		
		
	}

	public Person(String firstName, String lastName, Gender gender, LocalDate birthDate, LocalDate startDate,
			LocalDate finishDate, boolean marriedStatus, long homeNumber, long mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.marriedStatus = marriedStatus;
		this.homeNumber = homeNumber;
		this.mobileNumber = mobileNumber;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isMarriedStatus() {
		return this.marriedStatus;
	}
	public void setMarriedStatus(boolean marriedStatus) {
		this.marriedStatus = marriedStatus;
	}
	public long getHomeNumber() {
		return this.homeNumber;
	}
	public void setHomeNumber(int homeNumber) {
		this.homeNumber = homeNumber;
	}
	public long getMobileNumber() {
		return this.mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Gender getGender() {
		return this.gender;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getMiddleName() {
		return this.middleName;
	}
	public LocalDate getBirthDate() {
		return this.birthDate;
	}
	public LocalDate getStartDate() {
		return this.startDate;
	}
	public LocalDate getFinishDate() {
		return this.finishDate;
	}
	
	public abstract String getRegsNumber();
	
	@Override
	public String toString() {
		return "Person [firstName=" + this.firstName + ", middleName=" + this.middleName + ", lastName=" + this.lastName
				+ ", gender=" + this.gender + ", birthDate=" + this.birthDate + ", startDate=" + this.startDate
				+ ", finishDate=" + this.finishDate + ", marriedStatus=" + this.marriedStatus + ", homeNumber="
				+ this.homeNumber + ", mobileNumber=" + this.mobileNumber + "]";
	}
	public String toString2() {
		return "Person [firstName=" + this.firstName + ", lastName=" + this.lastName
				+ ", gender=" + this.gender + ", birthDate=" + this.birthDate + ", startDate=" + this.startDate
				+ ", finishDate=" + this.finishDate + ", marriedStatus=" + this.marriedStatus + ", homeNumber="
				+ this.homeNumber + ", mobileNumber=" + this.mobileNumber + "]";
	}

}
