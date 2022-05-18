package com.bilgeadam.boost.lesson023;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class CreatingMapExample {

	public static void main(String[] args) {
	HashMap<Integer, String> turkeyCities = new HashMap<>();
			
			turkeyCities.put(34, "Istanbul");
			turkeyCities.put(27, "Gaziantep");
			turkeyCities.put(46, "Kahramanmaras");
			turkeyCities.put(01, "Adana");
			turkeyCities.put(35, "İzmir");
			
			System.out.println(turkeyCities);
			
	HashMap<String, String> turkishFood = new HashMap<>();	
	
			turkishFood.put("Istanbul", "Fish");
			turkishFood.put("Gaziantep", "Meat");
			turkishFood.put("Kahramanmaras", "Ice cream");
			turkishFood.put("Adana", "Kebab");
			turkishFood.put("İzmir", "Boyoz");
			
			System.out.println(turkishFood);
			
			System.out.print("Please enter a city no number: ");
			Scanner input = new Scanner(System.in);
			int cityNo = input.nextInt();
			
			String city = turkeyCities.get(cityNo);
			String food = turkishFood.get(city);
			System.out.println(food);
			
//			String famousFood = turkishFood.get(turkeyCities.get(01));
//					System.out.println(famousFood);
	}

}
