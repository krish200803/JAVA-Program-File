package Inheritance.DerivedTypecasting.Upcasting;

public class DepartmentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		                                         Case 1
		
		University u1 = new College("SPPU",50 ,"Engineering", "Pune", 784512369, "sppu@gmail.com", "Sapkal college", 
				                   "A+", 500, "computer");
//		
////	Department d1 = (Department)u1;   // Class Cast Exception
//		
	    College c1 = (College) u1;
	    
	    c1.displayCollege();
	    c1.displayUniversity();
//	    
//	    System.out.println("*******************************************************************");
		
//		                                         Case 2
//	    
//	    College c2 = new Department("SPPU", 50, "Engineering", "Pune", 789456123, "sppu@gmail.com","sapkal", 
//	    		                    "A+", 1500, "Computer, ENTC, Electrical", "Computer","Umesh", 20, 400);
//	    
//	    University u2 = c2;
//	    
//	    Department d2 = (Department) u2;
//	    
//	    d2.displayCollege();
//	    d2.displayDepartment();
//	    d2.displayUniversity();
		
//		--------------------------------------------------------------------------------------------------------
		
//		                                            Case 3
		
//		University u1 = new Department("SPPU", 50, "Engineering", "Pune", 789456123, "sppu@gmail.com","sapkal", 
//	    		                    "A+", 1500, "Computer, ENTC, Electrical", "Computer","Umesh", 20, 400);
//		
//		College c1 = (College)u1;
//		
//		Department d1 = (Department)c1;
//		
//		d1.displayCollege();
//		d1.displayDepartment();
//		d1.displayUniversity();
		
		
	}

}
