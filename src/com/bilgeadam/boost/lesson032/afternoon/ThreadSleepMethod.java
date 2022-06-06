package com.bilgeadam.boost.lesson032.afternoon;

public class ThreadSleepMethod extends Thread {

	@Override
	public void run() {
	
		for(int i =1; i<5; i++) {
			try {
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		ThreadSleepMethod thread1 = new ThreadSleepMethod();
		ThreadSleepMethod thread2 = new ThreadSleepMethod();
		ThreadSleepMethod thread3 = new ThreadSleepMethod();
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		
	}
	

}
