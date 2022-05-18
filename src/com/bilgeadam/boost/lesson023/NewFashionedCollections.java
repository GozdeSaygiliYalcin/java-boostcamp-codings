package com.bilgeadam.boost.lesson023;

import java.util.LinkedList;

public class NewFashionedCollections {

	public static void main(String[] args) {

		LinkedList<String> strings =new LinkedList<>();
		
		strings.add("apple");
		strings.add("pear");
		strings.add("grappe");
		
		for (String string : strings) {
			System.out.println(string);
			
		}
		strings.add(2, "strawbery");
		System.out.println(strings);
	}

}
