package com.bilgeadam.boost.lesson022;

import java.util.ArrayList;
import java.util.List;

public class JavaList {

	public static void main(String[] args) {
		

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		
		list1.add("gözde");
		list1.add("boncuk");
		list1.add("yalçın");
		
		list1.set(0, "ponçik");
		
		//list1.remove(0);
		
		list2.addAll(list1);
		list1.get(0);
		
		System.out.println(list1.get(0));
		System.out.println(list1.size());
		System.out.println(list1.contains("efdal"));
		
		System.out.println(list1);
		System.out.println(list2);
	}

}
