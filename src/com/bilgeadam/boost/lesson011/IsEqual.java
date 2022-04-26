package com.bilgeadam.boost.lesson011;

public class IsEqual {

	public static void main(String[] args) {
		
		int x=5;
		int y=5;
		
		Integer x1 =new Integer(5);
		Integer y1 = new Integer(5);
		String str1 = new String("5");
		String str2 = new String("5");
		
		if(str1==str2) {
			System.out.println("x is equal to y");
		} else {
			System.out.println("x is not equal to y");
//			System.out.println(x1);
//			System.out.println(y1);
		}

	}

}
