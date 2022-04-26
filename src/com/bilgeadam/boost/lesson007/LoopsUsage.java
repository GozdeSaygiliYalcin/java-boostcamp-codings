package com.bilgeadam.boost.lesson007;

public class LoopsUsage {

	public static void main(String[] args) {
		int i = 1;
		while (i<=10)
		{
	System.out.println(i+ ".defa merhaba");
	i++;

		}
		
		int j = 1;
		do {
			System.out.println(j++ + ".defa hello");
		} while (j<10);
		
		for (int k = 0; k<10; k++) {
			System.out.println((k+1)+ ".kez bye bye");
		
		}
	}
}
