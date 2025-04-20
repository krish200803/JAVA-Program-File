package HasARelationship.Composotion;

public class PenDriver {

	public static void main(String[] args) {
		
//		Refil rf = new Refil("Blue", 20, "Use And Throw");    // Method 3 to Achieve Composition
		
//		Pen p1 = new Pen("Classmate", "Gel pen", 10, rf );     // Method 3 to Achieve Composition
		
//		Pen p1 = new Pen("Classmate", "Gel pen", 10, "Blue", 20, "Use And Throw" );   // Method 2 to Achieve Composition
		
		Pen p1 = new Pen("Classmate", "Gel pen", 10 );        // Method 1 to Achieve Composition
		p1.displayPen();
		
		p1.rf.displayRefil();
		
		//p1.refil.displayRefil();  // method chaining

	}

}
