package com.practice.interfaces;

import com.practice.enums.OBJECT_TYPE;

public interface AbstractFactory <T>{
	public T create(OBJECT_TYPE type);
}
