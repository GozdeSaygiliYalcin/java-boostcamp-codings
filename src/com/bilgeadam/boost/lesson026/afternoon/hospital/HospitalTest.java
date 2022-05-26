package com.bilgeadam.boost.lesson026.afternoon.hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bilgeadam.boost.lesson017.superclass.Employee;

public class HospitalTest {

	public static void main(String[] args) {
		
		Manager m1 = new Manager("gozde", "yalcin", "manager", 32, 20.3);
		Manager m2 = new Manager("efdal", "yalcin", "manager", 36, 20.4);

		Nurse n1 = new Nurse("john", "george", "nurse", 56, 12.6);
		Nurse n2 = new Nurse("jeremy", "muller", "nurse", 42, 19.2);
		
		Janitor j1 = new Janitor("harry", "potter", "janitor", 34, 17);
		Janitor j2 = new Janitor("ron", "weasley", "janitor", 38, 13);
		
		Doctor d1 = new Doctor("albus", "dumbledore", "doctor", 431, 56);
		Doctor d2 = new Doctor("hermonie", "granger", "doctor", 32, 12);
		
		System.out.println(m1 + " new salary is: "  + m1.rateOfIncrease(1.45));
		System.out.println(n1 + " new salary is: " + n1.rateOfIncrease(1.35));
		System.out.println(j1 + "  new salary is: " +j1.rateOfIncrease(1.65));
		System.out.println(d1 +  " new salary is: " +d1.rateOfIncrease(1.28));
		
		List<Person> employeeList = new ArrayList<Person>();
		employeeList.add(m1);
		employeeList.add(m2);
		employeeList.add(n1);
		employeeList.add(n2);
		employeeList.add(j1);
		employeeList.add(j2);
		employeeList.add(d1);
		employeeList.add(d2);
		
		List<Person> managerList = employeeList.stream().filter(person -> person.getJob().equalsIgnoreCase("m"))
		.collect(Collectors.toList());
		
		for (Person person2 : managerList) {
			System.out.println(person2);
		}
		System.out.println("=============================================");
		
		List<Manager> managerList2 = new ArrayList<Manager>();
		managerList2.add(m1);
		managerList2.add(m2);
		System.out.println(managerList2.toString());
	}

}
