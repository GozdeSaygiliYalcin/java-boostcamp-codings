package com.bilgeadam.boost.lesson035.afternoon.factory;


import com.bilgeadam.boost.lesson036.abstractfactory.Color;
import com.bilgeadam.boost.lesson036.abstractfactory.UnknownColorTypeExecption;
import com.bilgeadam.boost.lesson036.abstractfactory2.AbstractFactory;
import com.bilgeadam.boost.lesson036.abstractfactory2.Createable;
import com.bilgeadam.boost.lesson036.abstractfactory2.UnknownCreatableException;
import com.bilgeadam.boost.lesson036.factory.shapes.UnknownShapeTypeExecption;

public class AbstractFactoryTest {

	public static void main(String[] args) throws UnknownColorTypeExecption, UnknownShapeTypeExecption {
		
		try {
			AbstractFactory factory = FactoryProducer.produce("COLOR");
			Createable c = factory.create("RED");
			((Color)c).sayColorName();
			
			factory = FactoryProducer.produce("Shape");
			c = factory.create("rectangle");
			
		} catch (UnknownCreatableException e) {
			e.printStackTrace();
		}

	}

}
