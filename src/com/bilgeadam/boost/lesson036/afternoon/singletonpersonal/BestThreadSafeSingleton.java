package com.bilgeadam.boost.lesson036.afternoon.singletonpersonal;

public class BestThreadSafeSingleton {
	
	private static BestThreadSafeSingleton instance;
	
	private BestThreadSafeSingleton() {
		
	}
	
	public static BestThreadSafeSingleton getInstance() {
		
		if(instance == null) {
			synchronized (BestThreadSafeSingleton.class) {
				if(instance == null) {
					instance = new BestThreadSafeSingleton();
				}
				
			}
		}
		return instance;
	}

}
