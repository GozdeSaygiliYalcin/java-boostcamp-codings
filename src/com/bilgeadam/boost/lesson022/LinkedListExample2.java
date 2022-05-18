package com.bilgeadam.boost.lesson022;

import java.util.LinkedList;

public class LinkedListExample2 {

	public static void main(String[] args) {
		
		LinkedList<Integer> numbers = new LinkedList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		System.out.println("Numbers are: "+numbers);
		numbers.get(2);
		numbers.indexOf(3);
		
	}

}
