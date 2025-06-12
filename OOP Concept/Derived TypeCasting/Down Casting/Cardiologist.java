package Inheritance.DerivedTypecasting.DownCasting;

public class Cardiologist extends Doctor {
	
	String spl;
	String organ;
	
	public Cardiologist(String name,double fees, String degree, int exp, String hospital, String spl, String organ)
	{
		super(name, fees, degree, exp, hospital);
		
		this.spl = spl;
		this.organ = organ;
	}
	
	public void displayCardiologist()
	{
		displayDoctor();
		
		System.out.println("Specialist :"+ spl);
		System.out.println("Organ :"+ organ);
	}

}
