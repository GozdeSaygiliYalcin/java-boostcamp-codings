package com.bilgeadam.boost.lesson035.afternoon.factory2;

public class Jeep extends Car {

	@Override
	void placeGasTank() {
		amountGas = 123.5;
		
		System.out.println("The amount of the gas capacity is: " + amountGas);
		
	}

	@Override
	void insertTyres() {
		diameter = 4.5;
		
		System.out.println("The diameter of the tyres is: " + diameter);
		
	}

}
