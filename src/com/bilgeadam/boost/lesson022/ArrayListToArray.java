package com.bilgeadam.boost.lesson022;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("Java");
		languages.add("Pyhton");
		languages.add("C++");
		languages.add("Go");
		
		System.out.println(languages);
		
		//Create a new array of String type
		String[] arr = new String [languages.size()];
		
		//ArrayList is converting into an array
		languages.toArray(arr);
		
		//Access elements of the array
			for (String language : arr) {
				System.out.println(language);
				
			
			}
			
		ArrayList<String> languages2 = new ArrayList<>(Arrays.asList(arr));
		System.out.println(languages2);
			
	}

}
