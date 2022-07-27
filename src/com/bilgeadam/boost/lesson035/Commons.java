package com.bilgeadam.boost.lesson035;

import java.util.logging.Logger;

public class Commons {
	
	private static Commons instance = null;
	private Logger logger;
	private String something;
	
	private Commons() { //First step. Constructor method should be private.
		super();
		this.logger = Logger.getLogger("bla bla");
		this.something = " ";
	}
	
	public static Commons getInstance() { //Second step. Bir statik metor üzerinden sınıf örneğine erişebilmemiz gerekiyor.
		if(Commons.instance == null) { //
			Commons.instance = new Commons();	
		}
		return Commons.instance;
	}
	
	public Logger getLogger() {
		return this.logger;
	}
	
	public String getSomething() {
		return this.something;
	}
	
	public void setSomething(String something) {
		this.something = something;
	}
}
	
