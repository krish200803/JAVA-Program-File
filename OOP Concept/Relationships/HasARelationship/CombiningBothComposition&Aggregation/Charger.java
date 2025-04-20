package HasARelationship.CombiningBothAggregationAndComposotion;

public class Charger 
{
	private String brand;
	private int power;
	private String type;
	
	public Charger(String brand, int power, String type) {
		super();
		this.brand = brand;
		this.power = power;
		this.type = type;
		System.out.println("chager has been attached to mobile");
	}
	
	public void displayCharger() 
	{
		System.out.println("------------ Details of Charger -------------");
		System.out.println("Charger Brand : "+brand);
		System.out.println("Charger Power : "+power);
		System.out.println("Charger Type : "+type);
		System.out.println("============================================");
	}
	
}
