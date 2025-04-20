package HasARelationship.Aggregation;

public class Laptop {
	String brand;
	String model; 
	double price;
	
	public Laptop(String brand, String model, double price)
	{
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		
		System.out.println("Laptop has been inserted in the bag!");
		System.out.println("==============================");
	}
	
	public void displayLaptop()
	{
		System.out.println("-----Laptop Details-------");
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
		System.out.println("==============================");
	}

}