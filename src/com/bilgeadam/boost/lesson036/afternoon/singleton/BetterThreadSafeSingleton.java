package com.bilgeadam.boost.lesson036.afternoon.singleton;

public class BetterThreadSafeSingleton {
	
	private static BetterThreadSafeSingleton instance;

	
	public static BetterThreadSafeSingleton getInstanceUsingDoubleLocking() {
		
		if(instance == null) {
			synchronized (BetterThreadSafeSingleton.class) {
				
				if(instance == null) {
					instance = new BetterThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}
