package com.bilgeadam.boost.lesson036.abstractfactory2;

import com.bilgeadam.boost.lesson036.abstractfactory.UnknownColorTypeExecption;
import com.bilgeadam.boost.lesson036.factory.shapes.UnknownShapeTypeExecption;

public abstract class AbstractFactory {
	
	public abstract Createable create(String type) throws UnknownCreatableException, UnknownColorTypeExecption, UnknownShapeTypeExecption;

}
