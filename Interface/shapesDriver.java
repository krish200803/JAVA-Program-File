package Interface;

public class shapesDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shapes s = new shapesImp();
		
		s.areaofCircle(5);
		s.areaofSquare(5);
		s.perimeterOfSquare(5);
		
		System.out.println(s.pi);

	}

}
