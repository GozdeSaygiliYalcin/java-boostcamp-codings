package com.bilgeadam.boost.lesson022;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListasDeque {
	
	public static void main(String[] args) {
		
		Deque<String> animals =new LinkedList<>();
		
		animals.add("Cow");
		System.out.println(animals);
		
		
		animals.addFirst("Cat");
		System.out.println(animals);
		
		
		animals.addLast("Goat");
		System.out.println(animals);
		
		
	}

}
