package chap03;

import java.util.ServiceLoader;

import chap03.api.Vehicle;

public class VehicleMain {

	public static void main(String[] args) {
		new VehicleMain().drive();
	}
	
	private void drive() {
		ServiceLoader.load(Vehicle.class)
		.findFirst().ifPresent(Vehicle::move);
	}
}
