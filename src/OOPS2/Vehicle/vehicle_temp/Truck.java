package OOPS2.Vehicle.vehicle_temp;

import OOPS2.Vehicle.vehicle.Vehicle;

public class Truck extends Vehicle {
	int maxLoadingCapacity;
	public void print() {
		System.out.println("Truck Capacity : " + maxLoadingCapacity);
		System.out.println("Truck color : " + color);
		System.out.println("Truck Speed : " + getMaxSpeed());
	}
}
