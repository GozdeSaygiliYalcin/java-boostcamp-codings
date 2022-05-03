package com.bilgeadam.boost.lesson013.practice;

public class SampleMethod {

	String word = "Hello world";
	
	public static void main(String[] args) {
		String word = "Goodbye world";
		SampleMethod o1 = new SampleMethod();
		System.out.println(o1.otherSampleMethod(word)); //Goodbye world
		System.out.println(o1.word); //Hello world
		System.out.println(word); //Goodbye world
	}

	String otherSampleMethod(String word) {
		System.out.println(this.word); //Hello world
		return word;
		
	}
}
