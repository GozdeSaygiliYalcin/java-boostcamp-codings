package com.bilgeadam.boost.lesson013;

public class Test {
	
	public String publicVariable = "Public variable";
	protected String protectedVariable = "Protected variable";
	String defaultVariable = "Default variable"; //default değişkeni
	private String privateVariable = "Private variable";
	
public static void main(String[] args) {
	Test testObject = new Test();
	
	System.out.println("The variables that i access: " + testObject.publicVariable +testObject.protectedVariable + testObject.defaultVariable +testObject.privateVariable);
}
}
