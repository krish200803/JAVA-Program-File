class BookDriver1 
{
	public static void main(String[] args) 
	{
		Book1 b1 = new Book1();
	
		System.out.println(b1);
		System.out.println(b1.brand);
		System.out.println(b1.price);
		System.out.println(b1.noofpages);
		System.out.println(b1.type);
		System.out.println(b1.weight);
		System.out.println(b1.bound);
		System.out.println("---------------------------------------");

		Book1 b2 = new Book1();
	
		System.out.println(b2);
		System.out.println(b2.price);
		System.out.println(b2.noofpages);
		System.out.println(b2.type);
		System.out.println(b2.weight);
		System.out.println(b2.bound);		
	}
}
