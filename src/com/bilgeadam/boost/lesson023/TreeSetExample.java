package com.bilgeadam.boost.lesson023;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//Tree sort provides to sort small to big number
		//The process can be provided special
		
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(10);
		numbers.add(3);
		numbers.add(-10);
		
		for (Integer number : numbers) {
			System.out.println(number);
		}
			
		System.out.println(numbers);
	}

}
