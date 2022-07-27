package com.bilgeadam.boost.lesson035.afternoon.factory2;


public class CarFactory {
	
	public Car buildCar(String carName) {
		
		if(carName == null) {
			return null;
		}
		
		if(carName.equalsIgnoreCase("HatchBack")) {
			return new HatchBack();
		}
		
		else if(carName.equalsIgnoreCase("Jeep")) {
			return new Jeep();
			
		}
		
		else if(carName.equalsIgnoreCase("Sedan")) {
			return new Sedan();
		}
			return null;
	}

}
