package com.bilgeadam.boost.lesson036.afternoon.singletonpersonal;

public class SingletonEager {
	
	private static final SingletonEager instance = new SingletonEager();
	
	private SingletonEager() {	
	}

	public static SingletonEager getInstance() {
		return instance;
	}
}
