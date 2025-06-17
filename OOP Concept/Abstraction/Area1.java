package Abstraction;

public class Area1 extends AbstractAreas{
	
	public void areaOfCircle(double r)
	{
		System.out.println("Area Of Circle : "+ 3.14*r*r);
	}
	
	public void areaOfTriangle(double l, double b)
	{
		System.out.println("Area of Triangle: "+ 0.5* l *b);
	}
	
	public void areaOfCube(double l, double b, double h )
	{
		System.out.println("Area Of Cube: "+ l*b*h);
	}

}
