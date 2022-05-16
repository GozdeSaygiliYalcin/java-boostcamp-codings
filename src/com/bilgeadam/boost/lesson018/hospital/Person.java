package com.bilgeadam.boost.lesson018.hospital;

public abstract class Person {
	
	private String name;
	private int age;
	private boolean isHealty;
	

	public Person(String name, int age, boolean isHealty) {
		this.name = name;
		this.age = age;
		this.isHealty = isHealty;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHealty(boolean isHealty) {
		this.isHealty = isHealty;
	}

	boolean checkIfHealty() {
		if(this.isHealty == true) {
			checkUp();
			return true;
			
		}else
			examinePatient();
			givePrescription();
		return false;
	}
	abstract void checkUp();
	
	abstract void examinePatient();
	void givePrescription() {
		System.out.println("");
		
	}
	@Override
	public String toString() {
		return "Person [name=" + this.name + ", age=" + this.age + ", isHealty=" + this.isHealty + "]";
	}
	
	
}
