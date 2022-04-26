package com.bilgeadam.boost.lesson007;

import java.util.Scanner;

public class SwitchUsage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int note = scanner.nextInt();
		scanner.close();

		int evaluatedNote = note/10;
		switch (evaluatedNote) {
		case 10:
		case 9:
			System.out.println("not: A");
			break;
		case 8:
			System.out.println("not: B");
			break;
		case 7:
			System.out.println("not: C");
			break;
		case 6:
			System.out.println("not: D");
			break;
		case 5,4,3,2,1:
			System.out.println("NOT: F");
			break;
		default :
			System.out.println("HATALI GİRİŞ");
		
		}
	}

}
