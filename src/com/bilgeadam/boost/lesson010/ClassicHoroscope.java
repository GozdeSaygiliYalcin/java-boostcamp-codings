package com.bilgeadam.boost.lesson010;

import java.util.Scanner;

public class ClassicHoroscope {

	public static void main(String[] args) {
		
		int birthMonth;
		int birthDay;
		String horoscop = " ";
		boolean isError = false;
		
		Scanner o1 = new Scanner(System.in);
		System.out.print("Please enter your birth month as a number:");
		birthMonth = o1.nextInt();
		System.out.print("Please enter your birth day:");
		birthDay = o1.nextInt();
		
	
		switch(birthMonth) {
		
		case 1:
		if(birthDay>=1 && birthDay <=31 && birthMonth>=1 && birthMonth <=12) {
			if(birthDay<22) {
			horoscop = "Capricorn"; 
			} else {
			horoscop = "Aquarius";
			}
		} else {
			isError =true;
			}
			break;
			
		case 2:	
		if(birthDay>=1 && birthDay <=28 && birthMonth>=1 && birthMonth <=12) {
			if(birthDay<20) {
			horoscop ="Aquarius";   
			} else {
			horoscop = "Pisces";
			}
			} else {
			isError = true;
			}
			break;		
	
		case 3:
 		if(birthDay>=1 && birthDay <=30 && birthMonth>=1 && birthMonth <=12) {
 			if(birthDay<20) {
 			horoscop = "Pisces";
			} else {
			horoscop = "Aries";
			}
 			} else {
 			isError =true;
 			}
 			break;
 			
		case 4:
	 	if(birthDay>=1 && birthDay <=31 && birthMonth>=1 && birthMonth <=12) {
 			if(birthDay<21) {
	 		horoscop = "Aries";
			} else {
			horoscop = "Taurus";
			}
	 		} else {
	 		isError =true;
	 		}
	 		break;	
	 		
		case 5:
	 	if(birthDay>=1 && birthDay <=31) {
 			if(birthDay<21) {
 			horoscop = "Taurus";
			} else {
			horoscop = "Gemini";
			}
 			} else {
 			isError =true;
 			}
 			break;
 			
		case 6:
	 	if(birthDay>=1 && birthDay <=30 && birthMonth>=1 && birthMonth <=12) {
 			if(birthDay<21) {
 			horoscop = "Gemini";
			} else {
			horoscop = "Cancer";
			}
 			} else {
 			isError =true;
 			}
 			break;	
 		
		case 7:
		if(birthDay>=1 && birthDay <=30 && birthMonth>=1 && birthMonth <=12) {
 			if(birthDay<21) {
 			horoscop = "Cancer";
			} else {
			horoscop = "Leo";
			}
 			} else {
 			isError =true;
 			}
 			break;	

		case 8:
		if(birthDay>=1 && birthDay <=30 && birthMonth>=1 && birthMonth <=12) {
 			if(birthDay<22) {
 			horoscop = "Leo";
			} else {
			horoscop = "Virgo";
			}
 			} else {
 			isError =true;
 			}
 			break;	
 			
		case 9:
		if(birthDay>=1 && birthDay <=30 && birthMonth>=1 && birthMonth <=12) {
 			if(birthDay<22) {
 			horoscop = "Virgo";
			} else {
			horoscop = "Libra";
			}
 			} else {
 			isError =true;
 			}
 			break;		
	 			
		case 10:
		if(birthDay>=1 && birthDay <=30 && birthMonth>=1 && birthMonth <=12) {
 			if(birthDay<23) {
 			horoscop = "Libra";
			} else {
			horoscop = "Scorpio";
			}
 			} else {
 			isError =true;
 			}
 			break;	
	 			
		case 11:
		if(birthDay>=1 && birthDay <=30 && birthMonth>=1 && birthMonth <=12) {
 			if(birthDay<23) {
 			horoscop = "Libra";
			} else {
			horoscop = "Scorpio";
			}
 			} else {
 			isError =true;
 			}
 			break;	
	 		
		case 12:
		if(birthDay>=1 && birthDay <=30 && birthMonth>=1 && birthMonth<=12) {
 			if(birthDay<21) {
 			horoscop = "Scorpio";
			} else {
			horoscop = "Sagittarius";
			}
 			} else {
 			isError =true;
 			}
 			break;
	 			
	 		default: 
	 			isError = true;
		
		}
		if(isError) {
		System.out.println("Invalid Day or Month");
		
		} else {
		o1.close();
		System.out.println("Your Horoscop is " + horoscop);
		}
	}
}

