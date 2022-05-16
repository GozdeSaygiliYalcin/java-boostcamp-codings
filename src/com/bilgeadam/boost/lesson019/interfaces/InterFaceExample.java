package com.bilgeadam.boost.lesson019.interfaces;

interface WaterBootleInterface {
	
	String color = "Blue";
	
	void fillup();
	void pourOut();
}

public class InterFaceExample implements WaterBootleInterface {

	public static void main(String[] args) {
		System.out.println(color);

			InterFaceExample ex =new InterFaceExample();	
		}

	@Override
	public void fillup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pourOut() {
		// TODO Auto-generated method stub
		
	}

}
