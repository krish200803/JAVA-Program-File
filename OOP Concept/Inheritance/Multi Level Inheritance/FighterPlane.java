package Inheritance.MultiLevel;

public class FighterPlane extends Aeroplane {
	
	int gen;
	int seat;
	int range;
	String type;
	String refuelType;
	
	public FighterPlane() {
		
	}
	
	public FighterPlane(String ManufBrand, double price, int engine, int manufYear, int fuelcap, int speed, double weight, 
			int loadcap, int gen, int seat, int range, String type, String refuelType)
	{
		this.ManufBrand = ManufBrand;
		this.engine = engine;
		this.price = price;
		this.manufYear = manufYear;
		this.fuelcap = fuelcap;
		this.speed = speed;
		this.weight = weight;
		this.loadcap = loadcap;
		
		this.gen = gen;
		this.seat = seat;
		this.range = range;
		this.type = type;
		this.refuelType = refuelType;
	}
	
	public void displayFighterPlane()
	{
		System.out.println("-----Attribute of Fighter Plane------");
	
		System.out.println("Generation:"+ gen);
		System.out.println("Seat Capacity:"+ seat);
		System.out.println("Range:"+ range);
		System.out.println("Type:"+ type);
		System.out.println("Refuel Type:"+ refuelType);
		
		displayAeroplane();
		
	}

}
