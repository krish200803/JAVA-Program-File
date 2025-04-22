package Inheritance.SingleLevel;

import java.util.ArrayList;

public class VehicleCarExample {

	public static void main(String[] args) {
		
		ArrayList<String> vehicle = new ArrayList<String>();
		vehicle.add("Car");
		vehicle.add("Van");
		vehicle.add("Bus");
		vehicle.add("Bike");
		vehicle.add("Tractor");
		
		
		Car car = new Car("Mahindra", "BE 6e", "SUV", "Electric", 2500000.0, vehicle, "Mahindra", "4 Wheeller", "Electric");
		car.displayCar();
		
		car.displayVehicle();

	}

}
