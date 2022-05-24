package com.bilgeadam.boost.lesson024.afternoon;

public class User {
	
	int id;
	String name;
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	 public void talk() {
		 System.out.println("Hi, I am " + name);
	 }
	 
	@Override
	public String toString() {
		return "User [id=" + this.id + ", name=" + this.name + "]";
	}

}
