package com.bilgeadam.boost.lesson032.afternoon;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is running");
		
	}

	public static void main(String[] args) {
		MyThread2 runnable = new MyThread2();
		
		Thread thread = new Thread(runnable, "My thread");
		
		thread.start();
		
		thread.getName();
		
		System.out.println(thread.getName());
	}
}
