package com.bilgeadam.boost.lesson015;

public class PersonTest {

	public static void main(String[] args) {
		Person person1 =new Person();
		person1.setFirstName("gözde");
		person1.setLastName("saygılı");
		person1.setGender("woman");
		person1.setAge(32);
		
		System.out.println(person1);
		
		Person person2 =new Person(); 	
		person2.setFirstName("efdal");
		person2.setLastName("saygılı");
		person2.setGender("man");
		person2.setAge(35);

		System.out.println(person2);
		
		Person person3 =new Person();	
		person3.setFirstName("boncuk");
		person3.setLastName("saygılı");
		person3.setGender("catwoman");
		person3.setAge(2);
		
		System.out.println(person3);
		
	}

}
