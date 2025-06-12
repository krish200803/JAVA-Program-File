package Inheritance.DerivedTypecasting.Upcasting;

public class College extends University{
	
	String collegeName;
	String grade;
	int students;
	String department;
	
	
	public College(String name, int numbercolleges,String course,String address, long contact, String email, 
			String collegeName, String grade, int students, String department)
	{
		super(name, numbercolleges, course, address, contact, email); // University formal Arguments);
		this.collegeName = collegeName;
		this.grade = grade;
		this.students = students;
		this.department = department;
	}
	
	public void displayCollege()
	{
		displayUniversity();
		
		System.out.println("----------College Details----------");
		System.out.println("Name :"+ collegeName);
		System.out.println("Grade :"+ grade);
		System.out.println("No. of Students :"+ students);
		System.out.println("department :"+ department);
		System.out.println("====================================");
	}

}
