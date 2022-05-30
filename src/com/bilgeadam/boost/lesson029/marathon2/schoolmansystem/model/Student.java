package com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.model;

import java.time.LocalDate;

public class Student extends Person{

	private long parentNumber;
	private String registerId;
	private static int counterStudent;
	
	public Student(String firstName, String middleName, String lastName, Gender gender, LocalDate birthDate,
			LocalDate startDate, LocalDate finishDate, boolean marriedStatus, long homeNumber, long mobileNumber,
			long parentNumber, String registerId) {
		super(firstName, middleName, lastName, gender, birthDate, startDate, finishDate, marriedStatus, homeNumber,
				mobileNumber);
		this.parentNumber = parentNumber;
		this.registerId = registerId;
	}
	
	public Student(String firstName, String lastName, Gender gender, LocalDate birthDate,
			LocalDate startDate, LocalDate finishDate, boolean marriedStatus, long homeNumber, long mobileNumber,
			long parentNumber, String registerId) {
		super(firstName, lastName, gender, birthDate, startDate, finishDate, marriedStatus, homeNumber,
				mobileNumber);
		this.parentNumber = parentNumber;
		this.registerId = registerId;
	}

	@Override
	public String toString() {
		return "Student [parentNumber=" + this.parentNumber + ", registerDate=" + this.registerId + ", ="
				+ super.toString() + "]";
	}

	public String getRegisterDate() {
		
		int year = startDate.getYear();
		String num = String.format("%03d", ++counterStudent);
		return year+"-" +num;
	}

	public void setRegisterDate(String registerDate) {
		this.registerId = registerDate;
	}

	@Override
	public String getRegsNumber() {
		String num = String.format("%03d", ++counterStudent);
		return "S-" + num;
	} 
	
	public boolean isMarried() {
		return isMarriedStatus();
	}

	public void setMartialStatus(boolean marriageStatus) throws StudentMarriageExceptions  {
		if(isMarried())
		{
			throw new StudentMarriageExceptions("NOT ALLOWED. WRONG INFORMATION");
		}
	}
	
}
