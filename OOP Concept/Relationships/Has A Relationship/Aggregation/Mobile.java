package HasARelationship.Aggregation;

public class Mobile {
	String brand;
	String name;
	String type;
	double price;
	
	Sim s;
	Charger c;
	
	public Mobile() {};
	
	public Mobile(String brand, String name, String type, double price)
	{
		super();
		this.brand = brand;
		this.name  = name;
		this.type = type;
		this.price = price;
	}
	
	public void displayMobile()
	{
		System.out.println("----------- Details of Mobile -----------");
		System.out.println("Brand " + brand);
		System.out.println("Name :" + name);
		System.out.println("Type :" + type);
		System.out.println("Price :" + price);
		System.out.println("******************************************");
	}
	
	// Helper Method
	
	public void insertSim(String serviceProvider, String networkType, String type, long simNo)
	{
		s = new Sim(serviceProvider, networkType, type, simNo);
	}
	
	public void insertCharger(String brand, String capacity, String type, double price)
	{
		c = new Charger(brand, capacity, type, price);
	}
}
