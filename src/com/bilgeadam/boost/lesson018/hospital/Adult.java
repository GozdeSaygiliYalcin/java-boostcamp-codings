package com.bilgeadam.boost.lesson018.hospital;

public class Adult extends Person {

	public Adult(String name, int age, boolean isHealty) {
		super(name, age, isHealty);
		
	}

	@Override
	public String toString() {
		System.out.println(getName()+getAge());
		return "Adult []";
	}

	@Override
	void checkUp() {
		
			System.out.println("Check up is done");
		
	}

	@Override
	void examinePatient() {
		
		System.out.println("the patient is examined as medical");
		
	}

}
