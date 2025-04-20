package HasARelationship.Composotion;

public class Pen 
{
	String brand;
	String type;
	double price;
	Refil rf = new Refil("Blue", 10, "Use & Throw");       // Method 1 to Achieve composition
	
	//Refil rf;         // Method 2 to Achieve Composition
	
	//Refil rf;         // Method 3 to Achieve Composition
	
	public Pen(){};    // Default Constructor
	
	//<----------------------- Method 1 to Achieve Composition------------------------------->
	public Pen(String brand, String type, double price)
	{
		super();
		this.brand  =brand;
		this.type = type;
		this.price = price;
	}
	
//	<----------------------- Method 2 to Achieve Composition------------------------------->
//	public Pen(String brand, String type, double price, String color, double size, String refilType) 
//	{
//		super();
//		this.brand  =brand;
//		this.type = type;
//		this.price = price;
//		
//		rf = new Refil(color, size, refilType);   // Method 2 to Achieve Composition
//	}
	
	
//	<----------------------- Method 3 to Achieve Composition------------------------------->
//	public Pen(String brand, String type, double price, Refil rf )
//	{
//		super();
//		this.brand  =brand;
//		this.type = type;
//		this.price = price;
//		
//		this.rf = rf; 
//	}
	
	
	public void displayPen()
	{
		System.out.println("---------- Details of Pen ---------");
		System.out.println("Brand : " + brand);
		System.out.println("Type : " + type);
		System.out.println("Price : " + price);
		System.out.println("************************************");
	}
	
}
