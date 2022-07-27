package com.bilgeadam.boost.lesson036.afternoon.singleton;

public class EagerInitializedSingleton { 
	
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton() {
		
	}
	
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
}
