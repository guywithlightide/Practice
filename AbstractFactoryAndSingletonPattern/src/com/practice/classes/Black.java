package com.practice.classes;

import com.practice.interfaces.Color;

public class Black implements Color {

	@Override
	public String getColor() {
		return this.getClass().getSimpleName();
	}

}
