package com.bilgeadam.boost.lesson022;

import java.util.ArrayList;

public class ArrayListExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		
		ArrayList arrayList = new ArrayList();
		arrayList.add("elma");
		arrayList.add("armut");
		arrayList.add(0, "muz");
		
		for(Object object : arrayList) {
			String str = (String)object;
			
		}
	}

}
