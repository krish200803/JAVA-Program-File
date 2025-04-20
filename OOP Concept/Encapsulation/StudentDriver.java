package principlesOfOops;

public class StudentDriver {

	public static void main(String[] args) {
		
		Student s1 = new Student("Umesh", "Java",35000.0, "Deccan", 8.9, "BE", 79, 82, 784512363l); 
		
		System.out.println(s1.getbranch());    // branch = Deccan
		
		System.out.println();
		s1.setbranch(true, "hadapsar");            
		System.out.println(s1.getbranch());    // Branch change to hadapsar
		
		System.out.println(s1.getinstitute());
		System.out.println(s1.getname());
		System.out.println(s1.getcourse());
		
		System.out.println();
		s1.setbranch(true, "Wakad");
		System.out.println(s1.getbranch());    // Branch change to Wakad
		
		System.out.println(s1.getcgpa());
		System.out.println(s1.getdegree());
		System.out.println(s1.getsscPer());
		System.out.println(s1.gethscPer());
		System.out.println(s1.getphno());
		
		System.out.println(s1.getbranch());    // final value of the  branch will be Wakad
		
		System.out.println();
		s1.setphno(true, 123456789l);
		System.out.println(s1.getphno());   // Phone changed using getPhone() method
		
		
		
		System.out.println("-----------------------------------------------------");
		
		Student s2 = new Student("Manish", "Java", 0.0, "Hadapsar", 8.9, "BE", 79, 82, 784512363l);
		
		System.out.println(s2.getbranch());	
		
		System.out.println(s2.getinstitute());
		System.out.println(s2.getname());
		System.out.println(s2.getcourse());
		System.out.println(s2.getfees());
		
		System.out.println();
		s2.setbranch(true, "Deccan");
		System.out.println(s2.getbranch());   // Branch change to Deccan
		
		System.out.println(s2.getcgpa());
		System.out.println(s2.getdegree());
		System.out.println(s2.getsscPer());
		System.out.println(s2.gethscPer());
		System.out.println(s2.getphno());
		
		System.out.println();
		
//		s1.setphno(false, 987654321l);
		s2.setphno(true, 987654321l);
		System.out.println(s2.getphno());
		
		

	}

}
