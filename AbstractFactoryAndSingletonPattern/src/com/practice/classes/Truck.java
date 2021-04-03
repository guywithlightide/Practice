package com.practice.classes;

import com.practice.interfaces.Color;
import com.practice.interfaces.Vehicle;

public class Truck implements Vehicle{
	
	private Color color;
	
	@Override
	public String move() {
		return this.getClass().getSimpleName()+" moves";		
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Truck [move()=" + move() + ", getColor()=" + getColor().getColor() + "]";
	}

	
	
}
