package com.bilgeadam.boost.lesson022;

import java.util.ArrayList;
import java.util.Collections;

public class ListExampleHomeWork {

	public static void main(String[] args) {
		
		ArrayList<String> animals = new ArrayList<>();
		
		animals.add("Cow");
		animals.add("Cat");
		animals.add("Goat");
		animals.add("Butterfly");
		animals.add("Pig");
		animals.add("Dog");
		animals.add("Zebra");
		animals.add("Buffalo");
		animals.add("Fish");
		animals.add("Lion");

		//according to the index number 
		animals.get(2);
		System.out.println(animals.get(2));
				System.out.println();
		
		//remove
		animals.remove(4);
		System.out.println(animals.remove(4));
				System.out.println();
				
		//foreach
		for (String jungle : animals) {
			System.out.println(jungle);
				System.out.println();
		}
		
		animals.size(); //size of the index
		System.out.println("The size of the index: " + animals.size());
				System.out.println();
				
		animals.isEmpty();
		System.out.println(animals.isEmpty());
				System.out.println();
		
		animals.contains("Dog");
		System.out.println(animals.contains("Dog"));
				System.out.println();
	
		animals.indexOf("Dog");
		System.out.println("The index number of the dog is: "+ animals);
				System.out.println();
		
		animals.set(2, "Giraffe");
		System.out.println("New member is added: " + animals);
				System.out.println();
		
		animals.remove("Dog");
		System.out.println("Removed member is dog and please see the new list: " + animals);
				System.out.println();
		
		Collections.reverse(animals);
		System.out.println("Reversed list: " + animals);
				System.out.println();	
		
		Collections.sort(animals);
		System.out.println("Sorted list: " + animals);
				System.out.println();
		
		Collections.sort(animals, Collections.reverseOrder());
		System.out.println("Reverse sorted list: " + animals);
				System.out.println();
		
		animals.subList(2, 6);
		System.out.println("Please see the new list: " + animals);
				System.out.println();
		
		System.out.println("The last version is: " +animals);
	}

}
