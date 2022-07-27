package com.bilgeadam.boost.lesson036.abstractfactory;

import com.bilgeadam.boost.lesson036.abstractfactory2.AbstractFactory;

public class ColorFactory extends AbstractFactory {
	
	public Color create(String colorName) throws UnknownColorTypeExecption {
		
		if(colorName.equalsIgnoreCase("RED")) {
			return new Red();
		}
		if(colorName.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		if(colorName.equalsIgnoreCase("GREEN")) {
			return new Green();
		}
		throw new UnknownColorTypeExecption("Following color name is uncorrect " + colorName);

	}

}
