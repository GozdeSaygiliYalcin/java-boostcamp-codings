package com.bilgeadam.boost.lesson013;

public class TryThis {

	int variable=15; //class variable is created
	
	public static void main(String[] args) {
		
		int variable = 10; //a value is assigned into the main method
		TryThis tryThis = new TryThis(); //an object is created from this class
		System.out.println(tryThis.method(variable)); //The method we created is used as a printout.
		System.out.println(variable);//This variable is coming from this block which is defined inside the main method.
		System.out.println(tryThis.variable); // The variable created inside the class is printed to line.

	}
	int method(int variable) {
		//variable +=25;
		System.out.println(this.variable);
		return this.variable; //The value that the method includes as a parameter is used.
}
}