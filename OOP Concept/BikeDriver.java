class BikeDriver 
{
	public static void main(String[] args) 
	{
		Bike b1 = new Bike();
		b1.brand = "KTM";
		b1.name = "Duke 390";
		b1.price = 450000.0;
		b1.cc = 390;
		b1.mileage = 20;

		System.out.println(b1);    // Object reference number
		b1.displayBike();
	}
}
          

		  // output of program

//          Bike@28a418fc
//          Brand:KTM
//          Name:Chapri Bike     // local variable (First preference will always given to the local variable )
//          Name:Duke 390        // non static variable
//          Bike@28a418fc        
//          Price:450000.0
//          CC:390
//          Mileage:20