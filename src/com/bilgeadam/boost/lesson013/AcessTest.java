package com.bilgeadam.boost.lesson013;

public class AcessTest {

	public static void main(String[] args) {
		
		Test testObject = new Test();
		
		System.out.println("The variables that i access: "+ testObject.protectedVariable + " "+ testObject.publicVariable + " "+ testObject.defaultVariable);

	}

}
