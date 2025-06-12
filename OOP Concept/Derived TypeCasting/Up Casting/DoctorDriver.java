package Inheritance.DerivedTypecasting;

public class DoctorDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Doctor d1 = new Neurologist("Umesh ", 800.0, "M.B.B.S",8, "Poona Hospital","M.D (Neurologist)", "Brain");
		
		d1.displayDoctor();
		
//		d1.displayNeurologist();     //  CTE
		
		System.out.println("----------------------------------------");
		
		Doctor d2 = new Cardiologist("Manish ", 500.0, "M.B.B.S",8, "Patil Hospital","M.D (Cardiologist)", "Heart");
		
		d2.displayDoctor();
//		d2.displayCardiologist();     //  CTE
		
		System.out.println("-----------------------------");
		
		Doctor d3 = new Orthopedic("Ramesh ", 300.0, "M.B.B.S",8, "Sayadri Hospital","M.D (Orthopedic)", "Bones");
		
		d3.displayDoctor();
//		d3.displayOrthopedic();        // CTE
		
	}

}
