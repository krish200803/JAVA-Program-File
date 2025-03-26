class BookDriver
{
	public static void main(String[] args) 
	{
		Book b1 = new Book();

		b1.brand = "Classmate";
		b1.price = 120.0;
		b1.noofpages = 12;
		b1.type = "Single Rulled";
		b1.weight = 100;
		b1.bound = "Long Note";
	
		System.out.println(b1);
		System.out.println(b1.brand);
		System.out.println(b1.price);
		System.out.println(b1.noofpages);
		System.out.println(b1.type);
		System.out.println(b1.weight);
		System.out.println(b1.bound);
		System.out.println("---------------------------------------");

		Book b2 = new Book();

		b2.brand = "DOMS";
		b2.price = 150.0;
		b2.noofpages = 20;
		b2.type = "Double Rulled";
		b2.weight = 90;
		b2.bound = "Short Note";
	
		System.out.println(b2);
		System.out.println(b2.price);
		System.out.println(b2.noofpages);
		System.out.println(b2.type);
		System.out.println(b2.weight);
		System.out.println(b2.bound);		
	}
}
