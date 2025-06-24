package Interface;

public class shapesImp implements shapes{
	
	public void areaofSquare(int sides)
	{
		double area = sides*sides;
		System.out.println(area);
	}
	
	public void perimeterOfSquare(int sides)
	{
		double perimeter = 4*sides;
		System.out.println(perimeter);
	}
	
	public void areaofCircle(int rad)
	{
		double areaofCircle = pi*rad*rad;
		System.out.println(areaofCircle);
	}

}
