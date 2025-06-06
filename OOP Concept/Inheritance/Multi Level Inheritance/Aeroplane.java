package Inheritance.MultiLevel;

public class Aeroplane {
	
	String ManufBrand;
	double price;
	int engine;
	int manufYear;
	int fuelcap;
	int speed;
	double weight;
	int loadcap;
	
	public Aeroplane() {
		
	}
	
	public Aeroplane(String ManufBrand, double price, int engine, int manufYear, int fuelcap, int speed, double weight, 
			int loadcap)
	{
		this.ManufBrand = ManufBrand;
		this.engine = engine;
		this.price = price;
		this.manufYear = manufYear;
		this.fuelcap = fuelcap;
		this.speed = speed;
		this.weight = weight;
		this.loadcap = loadcap;
	}
	
	public void displayAeroplane()
	{
		System.out.println("-----Attribute of Aeroplane-----");
		System.out.println("Manufacture Brand:"+ ManufBrand);
		System.out.println("Engine:"+ engine);
		System.out.println("Price:"+ price);
		System.out.println("Manufacture Year:"+ manufYear);
		System.out.println("Fuel Capacity:"+ fuelcap);
		System.out.println("Speed:"+ speed);
		System.out.println("Weight:"+ weight);
		System.out.println("Load holding Capacity:"+ loadcap);
	}
}
