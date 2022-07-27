package com.bilgeadam.boost.lesson035.afternoon.factory2;

public class HatchBack extends Car{

	@Override
	void placeGasTank() {
		amountGas = 75;
		
		System.out.println("The amount of the gas capacity is: " + amountGas);
		
	}

	@Override
	void insertTyres() {
		diameter = 3;
		
		System.out.println("The diameter of the tyres is: " + diameter);
		
	}

}
