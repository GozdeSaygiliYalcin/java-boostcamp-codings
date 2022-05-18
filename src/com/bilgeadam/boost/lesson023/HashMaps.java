package com.bilgeadam.boost.lesson023;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMaps {

	public static void main(String[] args) {
		
		//creating a map using the HashMap
		Map<String, Integer> numbers = new HashMap<>();
		
		//insert elements to the map
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("four", 3242);
		numbers.put("five", 12);
		
	
		System.out.println("Map: " + numbers );
		
		System.out.println("Keys: " + numbers.keySet());
		
		System.out.println("Values: " + numbers.values());
		
		System.out.println("Numbers: " + numbers.entrySet());
		
		int value = numbers.remove("two");
		System.out.println("Removed number is: " + value);
		
		//---------------------------------------------------
		//creating a map using the TreeMap
		
		Map<String, Integer> values = new TreeMap<String, Integer>();
		values.put("hello", 22);
		values.put("world", 27);
		values.put("my", 12);
		values.put("name", 22);
		values.put("is", 22);
		values.put("boncuk", 22); //String has to be unique. Integer can be the same.
		
		
		System.out.println("TreeSet: " +values);
		
		//removing an elements
		int removedValue= values.remove("hello");
		System.out.println("removed value is: " + removedValue);
		System.out.println("Updates TreeSet: " +values);
	}

}
