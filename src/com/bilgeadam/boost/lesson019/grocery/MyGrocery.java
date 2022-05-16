package com.bilgeadam.boost.lesson019.grocery;

import java.time.LocalDate;
import java.time.Month;

import com.bilgeadam.boost.lesson019.grocery.person.Customer;
import com.bilgeadam.boost.lesson019.grocery.person.Employee;

public class MyGrocery {
	
	
	public static void main(String[] args) {
		
		
	//	Person p1 = new Person("Person 01- ", LocalDate.of(1989, Month.SEPTEMBER, 18));
	//	Person p2 = new Person("Person 02- ", LocalDate.of(1986, Month.JANUARY, 03));
	//  Employee e1 = new Employee("Employee 01- ", LocalDate.of(2020, Month.MARCH, 16));
	//	Employee e2 = new Employee("Employee 02- ", LocalDate.of(2021, Month.JUNE, 12));
		Employee e3 = new Employee("Employee 03- ", LocalDate.of(1989, Month.DECEMBER, 22), 675.0, null, null);
		
		Customer c1 = new Customer("Customer 01- ", LocalDate.of(2019, Month.NOVEMBER, 12));
		Customer c2 = new Customer("Customer 02- ", LocalDate.of(2019, Month.NOVEMBER, 12));
		
	//	System.out.println(p1);
	//	System.out.println(p2);
	//	System.out.println(e1);
	//	System.out.println(e2);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(e3);
	}

}
