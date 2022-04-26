package com.bilgeadam.boost.lesson008;

import java.util.Scanner;

public class gradeCalculation {

	public static void main(String[] args) {
		
		int mt1, mt2, f;
		double calc;
		
		Scanner o1 = new Scanner(System.in);
		System.out.println("please enter first midterm note");
		mt1 = o1.nextInt();
		
		System.out.println("please enter second midterm note");
		mt2 = o1.nextInt();
		
		System.out.println("please enter final note");
		f = o1.nextInt();
		
		calc =(((mt1*0.2)+(mt2*0.2))+(f*0.6));
		
		if(calc<49) {
		System.out.println("FF");
			
		}else if(calc<60) {
		System.out.println("DD");
		
		}else if(calc <= 69) {
		System.out.println("CC");
		
		}else if(calc <= 79) {
		System.out.println("BB");
		
		}else if (calc > 80) {
		System.out.println("AA");
		
		o1.close();
		}
		
	}

}
