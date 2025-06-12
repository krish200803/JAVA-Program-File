package Inheritance.DerivedTypecasting.Upcasting;

public class Department extends College{
		
	private String departmentname;
	private String hod;
	private int noOfstaff;
	private int noOfstudents;
	
	
	public Department(String name, int numbercolleges,String course,String address, long contact, String email, 
			String collegeName, String grade, int students, String department, String departmentname, String hod, 
			int noOfstaff, int noOfstudents)
	{
		super(name, numbercolleges, course, address, contact, email, collegeName, grade, students, department);
		this.departmentname = departmentname; 
		this.hod = hod;
		this.noOfstaff = noOfstaff;
		this.noOfstudents = noOfstudents;
	}
	
	public void displayDepartment()
	{
		System.out.println("----------Department Details----------");
		System.out.println("Name :"+ departmentname);
		System.out.println("HOD :"+ hod);
		System.out.println("No. of Staff :"+ noOfstaff);
		System.out.println("No. of Students :"+ noOfstudents);
		System.out.println("=======================================");
	}

}
