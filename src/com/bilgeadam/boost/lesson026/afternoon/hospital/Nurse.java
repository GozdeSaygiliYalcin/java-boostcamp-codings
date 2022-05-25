package com.bilgeadam.boost.lesson026.afternoon.hospital;

public class Nurse extends Person implements WageIncrease {

	public Nurse(String firstName, String lastName, String job, int age, double salary) {
		super(firstName, lastName, job, age, salary);
		
	}

	@Override
	public double rateOfIncrease(double increase) {
		return this.salary*increase;
	}

	
	}


	


