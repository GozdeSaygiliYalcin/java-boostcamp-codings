package com.bilgeadam.boost.lesson017;

public class VehicleTest {

	public static void main(String[] args) {
		

		Vehicle v1 = new Vehicle("fiat", "turtle", "blue");
		Vehicle v2 = new Vehicle(null, null, null);
	
		
		v1.setSpeed(200);
		
		System.out.println(" Vehicle 1 brand: " +v1.getBrand() +" speed: " + v1.getSpeed() + " color: " +v1.getColor());
		
		v2.setSpeed(300);
		
		System.out.println(" Vehicle 2 brand: " +v2.getBrand() +" speed: " + v2.getSpeed() + " color: " +v2.getColor());
	}

}
 