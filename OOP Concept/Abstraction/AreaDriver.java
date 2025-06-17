package Abstraction;

public class AreaDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractAreas a1 = new Area1();
		
		a1.areaOfRec(5, 5);
		
		a1.areaOfSquare(10);
		
		a1.areaOfCircle(5);
		
		a1.areaOfCube(3, 5, 4);
		
		a1.areaOfTriangle(4, 6);
		
		a1.periOfCircle(5);

	}

}
