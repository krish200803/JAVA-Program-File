package Inheritance.Hirarchical;

public class Neurologist extends Doctor{
	
	String spl;
	String organ;
	
	public Neurologist(String name,double fees, String degree, int exp, String hospital, String spl, String organ)
	{
		super(name, fees, degree, exp, hospital);
		
		this.spl = spl;
		this.organ = organ;
	}
	
	public void displayNeurologist() 
	{
		displayDoctor();
		
		System.out.println("Specialist :"+ spl);
		System.out.println("Organ :"+ organ);
	}

}
