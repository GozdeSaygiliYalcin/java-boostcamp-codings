package com.bilgeadam.boost.lesson023;

import java.util.HashSet;
import java.util.Iterator;

public class JavaSets {

	public static void main(String[] args) {
			
		HashSet<String> set = new HashSet<>();
		
		set.add("gözde");
		set.add("boncuk");
		set.add(null);
		set.add("sütlaç");
		
		
		set.remove("sütlaç");
		
		for (String name : set) {
			System.out.println(name);
			
		}
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
