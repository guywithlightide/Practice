package com.practice.classes;

import com.practice.enums.OBJECT_TYPE;
import com.practice.interfaces.AbstractFactory;
import com.practice.interfaces.Vehicle;

public class VehicleFactory implements AbstractFactory<Vehicle> {

	@Override
	public Vehicle create(OBJECT_TYPE vehicleType) {
		System.out.println("VehicleFactory with hashCode "+this.hashCode()+" creating vehicle "+vehicleType);
		switch (vehicleType) {
		case CAR:
			return new Car();
		case TRUCK:
			return new Truck();
		default:
			return null;
		}
		
	}

}
