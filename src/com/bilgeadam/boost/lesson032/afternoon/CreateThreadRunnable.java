package com.bilgeadam.boost.lesson032.afternoon;

public class CreateThreadRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread is running");		
	}
	public static void main(String[] args) {
		CreateThreadRunnable runnable = new CreateThreadRunnable();
	
		Thread thread = new Thread(runnable);
	
		thread.start();
	}
}
