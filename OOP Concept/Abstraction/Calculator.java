package Abstraction;

public abstract class Calculator {
	
	String brand = "Casio";
	
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub     
	}
	
	// We can have constructor i.e default constructor in an abstract class even though we cannot create the object 
	// of it because to load the members of abstract class as well as its parent members into its sub class object.

	public abstract void addition(int n1,int n2);                // abstract Method
	
	public abstract void division(double num, double den);       // abstract Method
	 
	public abstract void subtraction(int n1, int n2);           // abstract Method
	
	public void multiplication(int n1, int n2)               // Concrete Method
	{
		System.out.println(n1*n2);
	}

}
