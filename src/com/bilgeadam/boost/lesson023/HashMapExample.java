package com.bilgeadam.boost.lesson023;

import java.util.HashMap;
import java.util.Map.Entry;

import com.sun.jdi.Value;

public class HashMapExample {
	public static void main(String[] args) {
		
		HashMap<String, String> capitalCities = new HashMap<>();
		
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Turkey", "Ankara");
		capitalCities.put("Italy", "Roma");
		capitalCities.put("Thailand", "Bangkok");
		
		System.out.println(capitalCities);
		
		String city = capitalCities.get("England");
		System.out.println(city);
		
		capitalCities.remove("Thailand");
		System.out.println(capitalCities);
		
		System.out.println(capitalCities.containsKey("Thailand"));
		
		capitalCities.putIfAbsent("Greece", "Athens");
		System.out.println(capitalCities);
		
		for (String country : capitalCities.keySet()) {
			System.out.println(country);
			
			
		}
	}

}
