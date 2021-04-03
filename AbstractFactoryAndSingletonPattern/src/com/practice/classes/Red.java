package com.practice.classes;

import com.practice.interfaces.Color;

public class Red implements Color {

	@Override
	public String getColor() {
		return this.getClass().getSimpleName();
	}

}
