package com.bilgeadam.boost.lesson018;

public class Test {

	public static void main(String[] args) {
		
	//	Employee e = new Employee("Gozde", "Kucukyali", 505);  
	//because of the abstrack keyword it cannot be created a object 
		
		Salary s = new Salary("gozde", "kucukyali", 505, 1000);
		Employee e = new Salary("efdal", "kucukyali", 533, 500);
		s.mailCheck();
		e.mailCheck();
		
		

	}

}
