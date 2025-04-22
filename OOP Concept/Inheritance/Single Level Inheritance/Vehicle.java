package Inheritance.SingleLevel;

import java.util.ArrayList;

public class Vehicle {
	
	private ArrayList<String> type = new ArrayList<String>();
	
	private String brand;
	private String numberofWheels;
	private String engineType;
	
	public Vehicle() {
		super();
	}
	
	
	public Vehicle(ArrayList<String> type, String brand, String numberofWheels, String enginetype)
	{
		super();
		this.type = type;
		this.brand = brand;
		this.numberofWheels = numberofWheels;
		this.engineType = enginetype;
	}
	
	public void displayVehicle()
	{
		System.out.println("---------- Vehicle Details -----------");
		System.out.println("Type of Vehicle : "+ type);
		System.out.println("Brand of Vehicle : "+ brand);
		System.out.println("Number of Wheels : "+ numberofWheels);
		System.out.println("Engine Type of Vehicle : "+ engineType);
		System.out.println("=======================================");
	}
}
