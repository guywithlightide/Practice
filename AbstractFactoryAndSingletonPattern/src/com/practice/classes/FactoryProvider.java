package com.practice.classes;

import com.practice.enums.FACTORY_TYPE;
import com.practice.interfaces.AbstractFactory;

public class FactoryProvider {

	private static ColorFactory colorFactory;
	private static VehicleFactory vehicleFactory;
	
	public static AbstractFactory<?> getFactory(FACTORY_TYPE factoryType) {
		switch (factoryType) {
		case COLOR_FACTORY:
			return colorFactory==null?(colorFactory = new ColorFactory()):colorFactory;
		case VEHICLE_FACTORY:
			return vehicleFactory==null?(vehicleFactory = new VehicleFactory()):vehicleFactory;
		default:
			return null;
		}
	}
	
	
}
