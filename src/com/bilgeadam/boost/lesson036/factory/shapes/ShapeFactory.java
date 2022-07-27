package com.bilgeadam.boost.lesson036.factory.shapes;

import com.bilgeadam.boost.lesson036.abstractfactory2.AbstractFactory;

public class ShapeFactory extends AbstractFactory {
	
	
	public Shape create(String shapeName) throws UnknownShapeTypeExecption {
		
		if(shapeName.equalsIgnoreCase("square")) {
			return new Square();
		}
		if(shapeName.equalsIgnoreCase("circle")) {
			return new Circle();
		}
		if(shapeName.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		throw new UnknownShapeTypeExecption("Following shape name is uncorrect " + shapeName);

	}
	
public static Shape create(ShapeTypes type) throws UnknownShapeTypeExecption { //Second alternative in order to create types.
			
		return switch(type) {
			case SQUARE: {
			yield new Square();
			
			}
			case RECTANGLE: {
				yield new Rectangle();
			}
			case CIRCLE: {
				yield new Circle();
			}
			default:
				throw new UnknownShapeTypeExecption("Following shape name is uncorrect " + type);
		};
		
	}		
}