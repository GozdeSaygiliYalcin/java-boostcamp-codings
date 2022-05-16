package com.bilgeadam.boost.lesson020.enumandinterface;

public class BankTest {

	public static void main(String[] args) {
		

		Bank b1 = new Bank01();
		Bank b2 = new Bank02();
		
		b1.rateOfInterest();
		
		System.out.println(b2.rateOfInterest());

	}

}
