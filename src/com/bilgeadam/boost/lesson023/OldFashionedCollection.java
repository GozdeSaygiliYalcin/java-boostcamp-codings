package com.bilgeadam.boost.lesson023;

import java.util.LinkedList;

import com.bilgeadam.boost.lesson011.Person;

public class OldFashionedCollection {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		LinkedList list =new LinkedList();
		list.add(2);
		list.add(true);
		list.add(new Person());
		
		for (Object object:list) {
			System.out.println(object);
			if(object instanceof Integer) {
			int a = 2+(Integer)object;
		}	else if(object instanceof Boolean) {
			System.out.println(false);
		}

	}

}
}