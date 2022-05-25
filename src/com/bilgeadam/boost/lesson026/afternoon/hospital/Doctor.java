package com.bilgeadam.boost.lesson026.afternoon.hospital;

public class Doctor extends Person implements WageIncrease {

	public Doctor(String firstName, String lastName, String job, int age, double salary) {
		super(firstName, lastName, job, age, salary);
		
	}

	@Override
	public double rateOfIncrease(double increase) {
		System.out.println("Increased salary is: " + this.salary*increase);
		return this.salary*increase;
	}

	}


	

