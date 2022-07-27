package com.bilgeadam.boost.lesson024.afternoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonStream {

	public static void main(String[] args) {
		
		List<Person> personList = new ArrayList<Person>();
		
		personList.add(new Person("Whittaker","Godleman","Male",32));
		personList.add(new Person("Merola","Wrout","Female",32));
		personList.add(new Person("Melosa","Courage","Female",14));
		personList.add(new Person("Sydney","Cullington","Female",74));
		personList.add(new Person("Sherwin","Ogley","Male",14));
		personList.add(new Person("Dukie","Malpass","Male",30));
		personList.add(new Person("Jarrett","Fearick","Male",77));
		personList.add(new Person("Willie","Childerhouse","Male",31));
		personList.add(new Person("Berky","Tollmache","Male",73));
		personList.add(new Person("Nanete","Blunsden","Female",81));
		
		
		for (int i = 0; i < personList.size(); i++) {
			
		
		List<Person> newList = personList.stream().filter(person -> person.age < 50).collect(Collectors.toList());
		newList.stream().forEach(person -> System.out.println(person));
		System.out.println("====================================");
		
		Map<String, Integer> ageList50 = personList.stream().filter(person -> person.age < 50)
				.collect(Collectors.toMap(person-> person.firstName, person -> person.age));
		ageList50.forEach((key, value) -> System.out.println(key + " " + value));
		System.out.println("====================================");
		
		List<Person> speakerList = personList.stream().filter(person -> person.age < 35).collect(Collectors.toList());
		speakerList.stream().forEach(Person::talk);
		System.out.println("====================================");
	
		Set<Person> projectedMaleSet = personList.stream().map(person ->  new Person(person.firstName, person.lastName, person.gender, person.age+15))
				.filter(person -> person.gender == "Male")
				.collect(Collectors.toSet());
		
		projectedMaleSet.stream().forEach(person-> System.out.println(person.age + " " + person.firstName));
		System.out.println("====================================");
		
		List<Person> projectedMaleList = personList.stream().map(person ->  new Person(person.firstName, person.lastName, person.gender, person.age+15))
				.filter(person -> person.gender == "Male")
				.collect(Collectors.toList());
		
		projectedMaleList.stream().forEach(person-> System.out.println(person.age + " " + person.firstName));
		
		}
	}
}