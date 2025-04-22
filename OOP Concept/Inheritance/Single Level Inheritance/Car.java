package Inheritance.SingleLevel;

import java.util.ArrayList;

public class Car extends Vehicle {
	private String carBrand;
	private String carName;
	private String carType;
	private String engineType;
	private double price;
	
	public Car() {
		super();
	}
	
	
	public Car(String carBrand, String carName, String carType, String enginetype,  double price,
			            // Attributes of vehicle
			ArrayList<String> type, String brand, String numberofWheels, String enginetype1)
	{
		super(type, brand, numberofWheels, enginetype1);
		this.carBrand = carBrand;
		this.carName = carName;
		this.carType = carType;
		this.engineType = enginetype;
		this.price = price;
	}
	
	public void displayCar()
	{
		System.out.println("---------- Car Details -----------");
		System.out.println("Brand : "+ carBrand);
		System.out.println("Name : "+ carName);
		System.out.println("Type : "+ carType);
		System.out.println("Engine Type : "+ engineType);
		System.out.println("Price : "+ price);
		System.out.println("=======================================");
	}
	
}
