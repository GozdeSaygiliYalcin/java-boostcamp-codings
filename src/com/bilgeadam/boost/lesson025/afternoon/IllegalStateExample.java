package com.bilgeadam.boost.lesson025.afternoon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IllegalStateExample {

	public static void main(String[] args) {
	
	}
	public static void processArray() {
		
		List names =new ArrayList();
		names.add("boncuk");
		names.add("yalcin");
		
		Iterator iterator =names.iterator();
		
		try {
			while(iterator.hasNext()) {
				iterator.remove();
			}
		} catch (IllegalStateException e) {
			System.out.println("sutlac");
		}
		}
	}
