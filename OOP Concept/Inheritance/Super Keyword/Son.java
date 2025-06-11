package Inheritance.SuperKeyword;

public class Son extends Father{
	
	String name = "Umesh";
	
	public void displayName()
	{
		System.out.println(name);
	}
	
	public void displayFatherSonDetails()
	{
		System.out.println(name);
		System.out.println(super.name);
		// System.out.println(super); 
	}
	

}
