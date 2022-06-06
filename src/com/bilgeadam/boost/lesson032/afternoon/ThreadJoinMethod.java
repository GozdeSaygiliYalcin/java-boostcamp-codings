package com.bilgeadam.boost.lesson032.afternoon;

public class ThreadJoinMethod implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		ThreadJoinMethod t1 = new ThreadJoinMethod();
		Thread thread1 = new Thread(t1);
		
		
		Thread thread2 = new Thread(t1);
		
		
		Thread thread3 = new Thread(t1);
		
		thread1.start();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		thread2.start();
		thread3.start();
	}
	

}
