package com.bilgeadam.boost.lesson035.afternoon.factory;

import com.bilgeadam.boost.lesson036.abstractfactory.ColorFactory;
import com.bilgeadam.boost.lesson036.abstractfactory.ColorFactoryTest;
import com.bilgeadam.boost.lesson036.abstractfactory2.AbstractFactory;
import com.bilgeadam.boost.lesson036.abstractfactory2.UnknownCreatableException;
import com.bilgeadam.boost.lesson036.factory.shapes.ShapeFactory;

public class FactoryProducer {
	
	public static AbstractFactory produce(String factoryType) throws UnknownCreatableException {
		
		if (factoryType.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		if(factoryType.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		}
		throw new UnknownCreatableException("Given factory type is not supported " + factoryType);
	}

}
