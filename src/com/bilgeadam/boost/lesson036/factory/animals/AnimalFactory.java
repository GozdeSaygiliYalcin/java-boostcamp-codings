package com.bilgeadam.boost.lesson036.factory.animals;

import com.bilgeadam.boost.lesson036.abstractfactory.UnknownColorTypeExecption;
import com.bilgeadam.boost.lesson036.abstractfactory2.AbstractFactory;
import com.bilgeadam.boost.lesson036.abstractfactory2.Createable;
import com.bilgeadam.boost.lesson036.abstractfactory2.UnknownCreatableException;
import com.bilgeadam.boost.lesson036.factory.shapes.UnknownShapeTypeExecption;

public class AnimalFactory extends AbstractFactory{

	@Override
	public Createable create(String animal)
			throws UnknownCreatableException, UnknownColorTypeExecption, UnknownShapeTypeExecption {
		
		if(animal.equalsIgnoreCase("cat")) 
			return new Cat();
		
		if(animal.equalsIgnoreCase("dog")) 
			return new Dog();
		
		if(animal.equalsIgnoreCase("bird")) 
			return new Bird();
		
		return null;
		
		
	}

}
