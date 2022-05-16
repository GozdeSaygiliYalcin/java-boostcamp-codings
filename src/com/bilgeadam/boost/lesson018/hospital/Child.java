package com.bilgeadam.boost.lesson018.hospital;

public class Child extends Person {
	
	private boolean vaccinate;

	public Child(String name, int age, boolean isHealty) {
		super(name, age, isHealty);
	}

	public boolean isVaccinate() {
		return isVaccinate();
	}

	public void setVaccinate(boolean vaccinate) {
		this.vaccinate = vaccinate;
	}

	@Override
	void checkUp() {
		System.out.println("child check up is completed");
		
	}

	@Override
	void examinePatient() {
		System.out.println("child is cried during the examination");
		System.out.println("examination is done");
		
	}
	void getVaccine() {
		System.out.println("vaccinated");
	}

}
