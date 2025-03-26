class MobileDriver 
{
	public static void main(String[] args) 
	{
		Mobile s1 = new Mobile();

		s1.brand = "SAMSUNG";
		s1.model = "S25 ULTRA";
		s1.ram = 18;
		s1.rom = "1TB";
		s1.noofcam = 3;
		s1.price = 150000.0;
	
		System.out.println(s1);
		System.out.println(s1.brand);
		System.out.println(s1.model);
		System.out.println(s1.ram);
		System.out.println(s1.rom);
		System.out.println(s1.noofcam);
		System.out.println(s1.price);
		System.out.println("---------------------------------------");

		Mobile s2 = new Mobile();

		s2.brand = "IPHONE";
		s2.model = "16 PRO MAX";
		s2.ram = 18;
		s2.rom = "1TB";
		s2.noofcam = 4;
		s2.price = 139999.0;
	
		System.out.println(s2);
		System.out.println(s2.brand);
		System.out.println(s2.model);
		System.out.println(s2.ram);
		System.out.println(s2.rom);
		System.out.println(s2.noofcam);
		System.out.println(s2.price);
		System.out.println("---------------------------------------");

		Mobile s3 = new Mobile();

		s3.brand = "VIVO";
		s3.model = "X900 PRO";
		s3.ram = 18;
		s3.rom = "1TB";
		s3.noofcam = 4;
		s3.price = 129999.0;
	
		System.out.println(s3);
		System.out.println(s3.brand);
		System.out.println(s3.model);
		System.out.println(s3.ram);
		System.out.println(s3.rom);
		System.out.println(s3.noofcam);
		System.out.println(s3.price);
		System.out.println("---------------------------------------");
	}
}
