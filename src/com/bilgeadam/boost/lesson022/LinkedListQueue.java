package com.bilgeadam.boost.lesson022;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

	public static void main(String[] args) {
		//This is an example that works linkedList as Queue
		
		Queue<String> languages = new LinkedList<>();
		
		languages.add("Java");
		languages.add("Pyhton");
		languages.add("C++");
		languages.add("Go");

		System.out.println(languages);
		
		//Access the first element
		String language =languages.peek();
		System.out.println(language);
		
		//Access and remove the first element
		String lng = languages.poll();
		System.out.println(lng);
		
		languages.offer("JavaScript");
		System.out.println(language);
		
	}

}
