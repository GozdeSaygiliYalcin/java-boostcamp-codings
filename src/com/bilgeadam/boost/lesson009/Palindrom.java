package com.bilgeadam.boost.lesson009;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
	
		Scanner o1 =new Scanner(System.in);
		System.out.print("please enter a word:");
		String palindromeCanditate = o1.nextLine();
		
		palindromeCanditate = palindromeCanditate.trim(); //girilen metinin başındaki ve sonundaki spaceleri siler
		int length = palindromeCanditate.length(); //girilen metnin uzunluğunu ölçüyor
		palindromeCanditate = palindromeCanditate.toLowerCase(); //girilen metni tamamen küçük harfe döndürüyor
		
		boolean isPalindrome = true;
		for(int i =0; i<=length/2; i++) {
			if(palindromeCanditate.charAt(i) != palindromeCanditate.charAt(length-i-1)) {
				isPalindrome =false;
				break;
			}
		}
		String result = palindromeCanditate +" " + "bir" + " " +(isPalindrome ? "palindromdur" : "palindrom degildir");
		
		System.out.println(result);
		
		o1.close();
		System.out.println("Bye");

	}

}
