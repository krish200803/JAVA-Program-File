package Inheritance.MultiLevel;

import java.util.ArrayList;

class Department extends College{
	private String name;
	private String hod;
	private int noOfstaff;
	private int noOfstudents;
	
	public Department() {
		super();
	}
	
	public Department(String name, String hod, int noOfstaff, int noOfstudents,
											// College Attributes
					 String collegeName, String code, String grade,  String principal, int students, 
					 ArrayList<String> department, String address, String email,
					 						// University Attributes
					 String name1, int code1, int numbercolleges, ArrayList<String> course, String director,
					String address1, long contact, String email1)
	{
		super(collegeName, code, grade, principal, students, department, address, email,
							// University Attributes
			 name1, code1, numbercolleges, course, director, address1, contact, email1);
		this.name = name; 
		this.hod = hod;
		this.noOfstaff = noOfstaff;
		this.noOfstudents = noOfstudents;
	}
	
	public void displayDepartment()
	{
		System.out.println("----------Department Details----------");
		System.out.println("Name :"+ name);
		System.out.println("HOD :"+ hod);
		System.out.println("No. of Staff :"+ noOfstaff);
		System.out.println("No. of Students :"+ noOfstudents);
		System.out.println("=======================================");
	}
}