package chap03.impl;

import chap03.api.Vehicle;

public class SportVehicle implements Vehicle {

	@Override
	public void move() {
        System.out.println("SportCar, move");
	}

}
