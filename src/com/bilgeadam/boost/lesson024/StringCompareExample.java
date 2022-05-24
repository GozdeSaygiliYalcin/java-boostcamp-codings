package com.bilgeadam.boost.lesson024;

public class StringCompareExample {

	public static void main(String[] args) {
		
		String s1 = "happy";
		String s2 = "coders";
		
		int result1 = s1.compareTo(s2);
		System.out.println(result1);

		int result2 = s2.compareTo(s1);
		System.out.println(result2);
		
		Integer i = new Integer(12);
		System.out.println(i.compareTo(4));
	}

}
