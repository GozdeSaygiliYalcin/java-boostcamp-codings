package com.bilgeadam.boost.lesson026.afternoon.hospital;

public class Manager extends Person implements WageIncrease{

	public Manager(String firstName, String lastName, String job, int age, double salary) {
		super(firstName, lastName, job, age, salary);
		
	}

	@Override
	public double rateOfIncrease(double increase) {
		return this.salary*increase;
	}


	}

	
	


