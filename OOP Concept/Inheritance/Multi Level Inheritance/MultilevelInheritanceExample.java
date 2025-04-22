package Inheritance.MultiLevel;

import java.util.ArrayList;

public class MultilevelInheritanceExample {

	public static void main(String[] args) {
		
		ArrayList<String> depar = new ArrayList<String>();
		depar.add("CS");
		depar.add("ENTC");
		depar.add("MECH");
		depar.add("EEE");
		depar.add("CIVIL");
		
		ArrayList<String> course = new ArrayList<String>();
		course.add("BE");
		course.add("Phar");
		course.add("MBA");
		course.add("BCA");
		course.add("MCA");
		
		Professor professor = new Professor
				("Prof. Umesh Bhadane", "Assistant Professor", "PHD", 2314567892l, "DSA",
				 "CS", "Prof. Manish Bhadane", 10, 300,  // Department Actual Argument 
				 						// College Actual Argument
				 "COEP", "4076", "A++", "Umesh Bhadane", 3000, depar, "Pune", "coep@gmail.com" ,
				 						// University Actual Argument                  
				 "SPPU", 123456, 900, course, "Umesh Bhadane", "PUNE", 1234567890l, "sppu@gmail.com" );
		

		professor.displayProfessor();
		professor.displayDepartment();
		
		professor.displayCollege();
		professor.displayUniversity();
	}

}
