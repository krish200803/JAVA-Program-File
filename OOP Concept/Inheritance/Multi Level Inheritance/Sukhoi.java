package Inheritance.MultiLevel;

public class Sukhoi extends FighterPlane{
	
	String model;
	String ManufCountry;
	String serviceCoun;
	int serviceYears;
	String weapons;
	
	public Sukhoi() {
		
	}
	
	public Sukhoi(String ManufBrand, double price, int engine, int manufYear, int fuelcap, int speed, double weight, 
			int loadcap, int gen, int seat, int range, String type, String refuelType, String model, String ManufCountry, 
			String serviceCoun, int serviceYears, String weapons)
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
		
		this.model = model;
		this.ManufCountry = ManufCountry;
		this.serviceCoun = serviceCoun;
		this.serviceYears = serviceYears;
		this.weapons  = weapons;
		
	}
	
	public void displaySukhoi()
	{
		System.out.println("-----Attribute of Sukhoi------");
		System.out.println("Model Number:"+ model);
		System.out.println("Manufacture Country:"+ ManufCountry);
		System.out.println("Service Country:"+ serviceCoun);
		System.out.println("Service Years:"+ serviceYears);
		System.out.println("Carry Weapons:"+ weapons);
		
		displayFighterPlane();
		
	}
	

}
