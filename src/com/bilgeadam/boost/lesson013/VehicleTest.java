package com.bilgeadam.boost.lesson013;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.setColor("green");
		v1.setMaxSpeed(200);
		v1.setLabel("Mercedes");
		v1.setAutomaticGear(true);
		
		System.out.println(v1.toString());
		if(v1.isAutomaticGear()) {
			System.out.println("This car has automatic gear");
		}
		System.out.println("Color of V1 is " +v1.getColor() + " and Speed of V1 is " +v1.getMaxSpeed());
	}

}
