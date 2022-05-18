package com.bilgeadam.boost.lesson022;

import java.util.ArrayList;

public class ArrayListExample3 {
	
	// Array is a static form before to start the number of the index should be defined
	// ArrayList is a dynamic form the list length can be calculated with 
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//this is creating an arrayList
		@SuppressWarnings("rawtypes")
		ArrayList<String> languages = new ArrayList();
		
		languages.add("java");
		languages.add("c");
		languages.add("pyhton");
		
		System.out.println("languages:" + languages);
		
		System.out.println(languages.get(1));
		languages.set(2, "javascript");
		System.out.println("languages:" + languages);
		
		//languages.remove(2);
		System.out.println("languages:" + languages);
		
		for(String language: languages) {
			System.out.println(language);
		}
	}

}
