package com.bilgeadam.boost.lesson022;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		
		//This is creating a list using the ArrayList class
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		System.out.println("List" + numbers);
		
		//Access element using index number
		System.out.println(numbers.get(2));
		
		int removedNumber =numbers.remove(0);
		System.out.println("Removed numbers: " + removedNumber);
		
		System.out.println(numbers);

	}

}
