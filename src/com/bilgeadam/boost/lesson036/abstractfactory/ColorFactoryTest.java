package com.bilgeadam.boost.lesson036.abstractfactory;

import com.bilgeadam.boost.lesson036.abstractfactory2.AbstractFactory;

public class ColorFactoryTest extends AbstractFactory {

	public static void main(String[] args) {
		
		try {
			Color c1 = ColorFactory.create("RED");
			c1.sayColorName();
			
			Color c2 = ColorFactory.create("BLUE");
			c2.sayColorName();
			
			Color c3 = ColorFactory.create("GREEN");
			c3.sayColorName();
			
			Color c4 = ColorFactory.create("BLACK");
			c4.sayColorName();
			
		} catch (UnknownColorTypeExecption e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
