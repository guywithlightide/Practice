package com.practice.classes;

import com.practice.enums.OBJECT_TYPE;
import com.practice.interfaces.AbstractFactory;
import com.practice.interfaces.Color;

public class ColorFactory implements AbstractFactory<Color> {

	@Override
	public Color create(OBJECT_TYPE colorType) {
		System.out.println("ColorFactory with hashCode "+this.hashCode()+" creating color "+colorType);
		switch (colorType) {
		case RED:
			return new Red();
		case BLACK:
			return new Black();
		default:
			return null;
		}
		
	}

	
}
