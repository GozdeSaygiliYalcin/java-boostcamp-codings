package com.bilgeadam.boost.lesson013;

public class PasswordTest {

	public static void main(String[] args) {
		Password password =new Password();
		
		if (password.assign(" ", "qwer")) {
			System.out.println("new password is created");
		}
		else {
			System.err.println("The error is occured");
		}
		if (password.assign(" ", "asd")) {
			System.out.println("new password is created");
		}
		else {
			System.err.println("The error is occured");
		}
}
}