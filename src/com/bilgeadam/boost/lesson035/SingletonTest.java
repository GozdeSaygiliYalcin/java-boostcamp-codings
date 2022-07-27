package com.bilgeadam.boost.lesson035;

public class SingletonTest {

	public static void main(String[] args) {
		
		System.out.println("something interesting");
		
		Commons.getInstance().getLogger().info("by using logger");
		Commons.getInstance().setSomething("something");
		
		System.out.println(Commons.getInstance().getSomething());
	}

}
