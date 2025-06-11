package Inheritance.Hirarchical;

public class DoctorDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Neurologist n1 = new Neurologist("Umesh ", 800.0, "M.B.B.S",8, "Poona Hospital","M.D (Neurologist)", "Brain");
		
//		n1.displayDoctor();
		n1.displayNeurologist();
		
		System.out.println("-----------------------------");
		
		Cardiologist n2 = new Cardiologist("Manish ", 500.0, "M.B.B.S",8, "Patil Hospital","M.D (Cardiologist)", "Heart");
		
//		n2.displayDoctor();
		n2.displayCardiologist();
		
		System.out.println("-----------------------------");
		
		Orthopedic n3 = new Orthopedic("Ramesh ", 300.0, "M.B.B.S",8, "Sayadri Hospital","M.D (Orthopedic)", "Bones");
		
//		n3.displayDoctor();
		n3.displayOrthopedic();

	}

}
