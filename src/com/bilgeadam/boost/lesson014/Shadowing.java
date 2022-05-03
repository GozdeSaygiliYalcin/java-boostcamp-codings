package com.bilgeadam.boost.lesson014;

public class Shadowing {
	String a;
	int b;

	public static void main(String[] args) {
		Shadowing shadow =new Shadowing();
		System.out.println(shadow.foo(10));

	}
	int foo(int a) { //class variables are shadowing in this case. The variables that known with the same name are shadowing 						class variables at the local block.
		int b=50;
		return a+b;
	}
}
