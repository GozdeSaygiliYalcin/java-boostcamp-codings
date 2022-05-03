package com.bilgeadam.boost.lesson016.homepractice;

public class ReturnMethod {
	
	static int sum(int a, int b) {
	
	int result= a+b;
	System.out.println(result);
	return a+b;
	}
	public static void main(String[] args) {
		int result =sum(12, 2) +sum(3,4) +sum(5,7);
		//System.out.println(result);

	}

}
