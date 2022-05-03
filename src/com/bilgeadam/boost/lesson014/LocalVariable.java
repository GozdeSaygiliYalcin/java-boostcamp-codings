package com.bilgeadam.boost.lesson014;

public class LocalVariable {

	int y;
	
	public static void main(String[] args) {
		int x=12;
		System.out.println(x);
		LocalVariable loc = new LocalVariable();
		System.out.println(loc);
		System.out.println(loc.y);
	}

}
