package com.practice.main;

import com.practice.classes.Black;
import com.practice.classes.Car;
import com.practice.classes.FactoryProvider;
import com.practice.classes.Red;
import com.practice.classes.Truck;
import com.practice.enums.FACTORY_TYPE;
import com.practice.enums.OBJECT_TYPE;
import com.practice.interfaces.AbstractFactory;
import com.practice.interfaces.Color;
import com.practice.interfaces.Vehicle;

public class MainClass {
	
	public static void main(String[] args) {
		
		AbstractFactory<?> abstractFactory = null;
		Color color = null;
		Vehicle vehicle = null;
		
		abstractFactory = FactoryProvider.getFactory(FACTORY_TYPE.COLOR_FACTORY);
		color = (Red) abstractFactory.create(OBJECT_TYPE.RED);
		abstractFactory = FactoryProvider.getFactory(FACTORY_TYPE.VEHICLE_FACTORY);
		vehicle = (Car) abstractFactory.create(OBJECT_TYPE.CAR);		
		Car car = (Car) vehicle;
		car.setColor(color);
		System.out.println(vehicle);
		
		abstractFactory = FactoryProvider.getFactory(FACTORY_TYPE.COLOR_FACTORY);
		color = (Black) abstractFactory.create(OBJECT_TYPE.BLACK);
		abstractFactory = FactoryProvider.getFactory(FACTORY_TYPE.VEHICLE_FACTORY);
		vehicle = (Truck) abstractFactory.create(OBJECT_TYPE.TRUCK);
		Truck truck = (Truck) vehicle;
		truck.setColor(color);
		System.out.println(vehicle);
	}
}
