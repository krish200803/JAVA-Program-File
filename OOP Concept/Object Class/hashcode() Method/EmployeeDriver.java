package ObjectClass.HashCode;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("Umesh", 23, "Development", "Amdocs", 1234, 1500000.0);
		
		Employee e2 = new Employee("Umesh", 23, "Development", "Amdocs", 1234, 1500000.0);
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println(e1==e2);  // Check Original Reference Therefore it will always FALSE.
		
		System.out.println(e1.equals(e2)); 
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println("-------------------------------------------------------------------------");
		
		Employee e3 = new Employee("Umesh", 23, "Testing", "Amdocs", 1234, 1500000.0);
		
		Employee e4 = new Employee("Umesh", 23, "Testing", "Amdocs", 1212, 1500000.0);
		
		System.out.println(e3);
		System.out.println(e4);
		
		System.out.println(e3==e4);  // Check Original Reference Therefore it will always FALSE.
		
		System.out.println(e3.equals(e4));   
		
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());

	}

}
