package com.bilgeadam.boost.lesson012;

public class Parameters {

	public static void main(String[] args) {
		
		int a = 13;
		int b =2;
		System.out.println("3+2 = " + add(a,b));
		System.out.println("3+2 = "+ multiply(a,b));
		System.out.println("3'ün karesi = "+ quadrad(a));

	}

	private static int quadrad(int a) {
		return multiply(a,a);
	}

	private static int multiply(int a, int b) {
		return a*b;
	}

	private static int add(int a, int b) {
		a++;
		b++;
		return a+b;
	}
}
