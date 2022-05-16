package com.bilgeadam.boost.lesson017.superclass;

public class Test {

	public static void main(String[] args) {
	

		Dog d = new Dog();
		d.work();
		d.eat();
		
		Dog3 d3 = new Dog3();
		
		
		Employee e = new Employee(1, "gozde", 35);
		e.display();
		
	}

}
