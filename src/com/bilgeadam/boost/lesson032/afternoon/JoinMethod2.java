package com.bilgeadam.boost.lesson032.afternoon;

public class JoinMethod2 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i);
		}

}
}
