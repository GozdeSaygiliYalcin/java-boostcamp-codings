package com.bilgeadam.boost.lesson018;

public class Salary extends Employee {
	
	private double salary;
	

	public Salary(String name, String adress, int number, double salary) {
		super(name, adress, number);
		this.salary =salary;
		
	}

	
	
	@Override
	public void mailCheck() {
		System.out.println("Within mailcheck of salary class");
		System.out.println("Mailin check to " + getName() + " with salary " +salary);
	}



	@Override
	public double computePay() {
		System.out.println("Computing salary pay for " +getName());
		return salary/12;
	}



	public double getSalary() {
		return this.salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

}
