class Bike                   // This Keyword program
{
	String brand;                       
	String name;
	double price;                             //  First preference will always given to the local variable 
	int cc;
	int mileage;

	public void displayBike()
	{
		String name = "Chapri Bike";              // local variable
		System.out.println("Brand:"+ brand);
		System.out.println("Name:"+ name);         // prints the local variable  
		System.out.println("Name:"+ this.name);    // prints the non-static variable (declared with object reference in driver class) 

		System.out.println(this);
		System.out.println("Price:"+ price);
		System.out.println("CC:"+ cc);
		System.out.println("Mileage:"+ mileage);
	}
}
