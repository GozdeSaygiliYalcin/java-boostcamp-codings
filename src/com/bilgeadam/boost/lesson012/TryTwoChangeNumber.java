package com.bilgeadam.boost.lesson012;

public class TryTwoChangeNumber {

	public static void main(String[] args) {
		int aNumber = 10;
		changeNumber(aNumber);
		System.out.println(aNumber);
		System.out.println(changeNumber1(aNumber));
		System.out.println(changeNumber(aNumber));
	}

	private static int changeNumber(int aNumber) {
		aNumber =25;
		return aNumber;
	}
	private static boolean changeNumber1(int aNumber) {
		aNumber =32;
		return false;
}
}