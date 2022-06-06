package com.bilgeadam.boost.lesson032;

public class MultiInterfaceExample implements Runnable {

	public static void main(String[] args) {
		
		MultiInterfaceExample m1 = new MultiInterfaceExample();
		Thread t1 = new Thread();
		t1.start();
	
	}
	@Override
	public void run() {
		
		System.out.println("Thread is working. ");
		
	}

	
}
