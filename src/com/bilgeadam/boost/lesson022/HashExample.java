package com.bilgeadam.boost.lesson022;

import java.util.HashMap;
import java.util.Iterator;

public class HashExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put(1, "elma");
		hm.put(2, "armut");
		hm.put(5, "elma");

		Iterator valueIter = hm.values().iterator();
		while(valueIter.hasNext()) {
			String str = (String)valueIter.next();
			System.out.println(str);
			
		}
		Iterator keyIter = hm.keySet().iterator();
		while(keyIter.hasNext()) {
			int str = (Integer)keyIter.next();
			System.out.println(str);
	}
		System.out.println(hm.get(2));
}
}