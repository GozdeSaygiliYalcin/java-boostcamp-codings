package com.bilgeadam.boost.lesson036.factory.shapes;

public class ShapeFactoryTest {

	public static void main(String[] args) {
		
		try {
			Shape s1 = ShapeFactory.create("square");
			s1.draw();
			
			Shape s2 = ShapeFactory.create("rectangle");
			s2.draw();
			
			Shape s3 = ShapeFactory.create("circle");
			s3.draw();
		} catch (UnknownShapeTypeExecption e) {
			
			e.printStackTrace();
		}

	}

}
