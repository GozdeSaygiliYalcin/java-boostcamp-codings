package com.bilgeadam.boost.lesson018.hospital;

public class HospitalTest {

	public static void main(String[] args) {
		
		Child child = new Child("boncuk", 2, false);
		Person adult = new Adult("gozde", 32, true);
		
		child.checkIfHealty();
		adult.checkIfHealty();
	
		System.out.println(child);

	}

}
