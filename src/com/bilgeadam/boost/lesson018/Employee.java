package com.bilgeadam.boost.lesson018;

public abstract class Employee {
	
	private String name;
	private String adress;
	private int number;
	
	//all args constructor
	public Employee(String name, String adress, int number) {
		this.name = name;
		this.adress = adress;
		this.number = number;

	}
	
	public double computePay() {
		System.out.println("Inside Employee computePay");
		return 0.0;
		
	}
	
	public void mailCheck() {
		System.out.println("Mailing check to " + this.name + " "+ this.adress);
	}

	
	@Override
	public String toString() {
		return "Employee [name=" + this.name + ", adress=" + this.adress + ", number=" + this.number + "]";
	}

	//getters and setters
	public String getName() {
		return this.name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdress() {
		return this.adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public int getNumber() {
		return this.number;
	}


	public void setNumber(int number) {
		this.number = number;
	}
	
	

}
