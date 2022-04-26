package com.bilgeadam.boost.lesson007;

import java.util.Scanner;

public class AgeEvaluation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		scanner.close();

		if(age<18) {
			System.out.println("çocuk");
		}
		else if(age>=18 && age<30) {
			System.out.println("genç");
		}
		else if(age>=30 && age<50) {
			System.out.println("orta yaşlı");
		}
		else {
			System.out.println("yaşlı");
		}
	}

}
