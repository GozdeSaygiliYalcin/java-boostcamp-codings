package com.bilgeadam.boost.lesson022;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		
		ArrayList<String> list =new ArrayList<>();
		list.add("gözde");
		list.add("efdal");
		list.add("boncuk");
		
		System.out.println(list);
		
		
		//Reversing given an arraylist
		Collections.reverse(list);
		System.out.println("Reversed list: " + list);
		
		//Sorts an arraylist in ascending order
		Collections.sort(list);
		System.out.println("Sorted list: " + list);
		
		//sorts an arrayList in descending order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Reverse sorted list: " + list);
		
	}

}
