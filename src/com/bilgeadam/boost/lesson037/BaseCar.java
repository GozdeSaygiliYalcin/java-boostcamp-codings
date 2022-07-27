package com.bilgeadam.boost.lesson037;

public abstract class BaseCar {
	
	public int tripKm(int distance) {
		return distance;
	}

	public abstract double getCostPerKm();
	
	public void sendTripInfoMailToDriver() {
		
		System.out.println("Email: Trip info");
	}
	
	public void sendTripInfoSMSToDriver() {
		
	}
}
