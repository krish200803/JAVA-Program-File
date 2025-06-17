package Abstraction;

public abstract class AbstractAreas  extends Areas{
	
	public abstract void areaOfCircle(double r);
	
	public abstract void areaOfTriangle(double l, double b);
	
	public abstract void areaOfCube(double l, double b, double h );
	
	public void periOfCircle(double r) 
	{
		System.out.println("Perimeter of Circle is "+ 2*3.14*r);
	}

}
