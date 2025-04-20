package HasARelationship.Aggregation;

public class Charger {
	String brand;
	String capacity;
	String type;
	double price;
	
	public Charger() {};
	
	public Charger(String brand, String capacity, String type, double price)
	{
		super();
		this.brand = brand;
		this.capacity = capacity;
		this.type = type;
		this.price = price;
	}
	
	public void displayCharger()
	{
		System.out.println("--------- Details of Charger -----------");
		System.out.println("Brand :" + brand);
		System.out.println("Capacity :"+ capacity);
		System.out.println("Type :" + type);
		System.out.println("Price :" + price);
		System.out.println("*****************************************");
	}
}
