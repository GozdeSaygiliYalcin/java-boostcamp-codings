package com.bilgeadam.boost.lesson035.afternoon.factory2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class CarGasFactoryTest {

	public static void main(String[] args) throws IOException {
		
		CarFactory carFac = new CarFactory();
		System.out.print("Enter the name of car: ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		String carName = br.readLine();
		
		Car car = carFac.buildCar(carName);
		
		System.out.println("Car Name is: " + carName + " and this car has following attributes" );
		car.placeGasTank();
		car.insertTyres();

	}

}
