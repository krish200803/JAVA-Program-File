package HasARelationship.CombiningBothAggregationAndComposotion;

public class HeadPhone 
{
	private String brand;
	private String type;
	private String driver;
	private double price;
	
	public HeadPhone(String brand, String type, String driver, double price) {
		super();
		this.brand = brand;
		this.type = type;
		this.driver = driver;
		this.price = price;
		System.out.println("headphones has been pluged to mobile");
	}

	public void displayHeadPhone() {
		System.out.println("----------- Details of Head Phone -----------");
		System.out.println("HeadPhone Brand : "+brand);
		System.out.println("HeadPhone Type : "+type);
		System.out.println("HeadPhone Driver : "+driver);
		System.out.println("HeadPhone Price : "+price);
		System.out.println("==============================================");
	}
	
}

