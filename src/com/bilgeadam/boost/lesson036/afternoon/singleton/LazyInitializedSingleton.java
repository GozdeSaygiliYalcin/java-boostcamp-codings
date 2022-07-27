package com.bilgeadam.boost.lesson036.afternoon.singleton;

public class LazyInitializedSingleton {
	
	private static LazyInitializedSingleton instance;
	
	private LazyInitializedSingleton() {
		
	}

	public static LazyInitializedSingleton getInstance() {
		
		if(instance == null) {
			instance = new LazyInitializedSingleton();		
		}
		return instance;
	}
}
