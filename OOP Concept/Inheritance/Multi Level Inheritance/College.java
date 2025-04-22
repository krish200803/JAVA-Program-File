package Inheritance.MultiLevel;

import java.util.ArrayList;

class College extends University  {
	private String collegeName;
	private String code;
	private String grade;
	private String principal;
	private int students;
	
	private ArrayList<String> department = new ArrayList<String>();
	private String address;
	private String email;
	
	public College() {
		super();
	}
	
	public College(String collegeName, String code, String grade,  String principal, int students, 
			ArrayList<String> department, String address, String email,
									// University Attributes
			String name, int code1, int numbercolleges, ArrayList<String> course, String director,
			String address1, long contact, String email1)
	{
		super(name, code1, numbercolleges, course, director, address1, contact, email1); // University formal Arguments);
		this.collegeName = collegeName;
		this.code = code;
		this.grade = grade;
		this.principal = principal;
		this.students = students;
		this.department = department;
		this.address  = address;
		this.email = email;
	}
	
	public void displayCollege()
	{
		System.out.println("----------College Details----------");
		System.out.println("Name :"+ collegeName);
		System.out.println("Code :"+ code);
		System.out.println("Grade :"+ grade);
		System.out.println("Principal :"+ principal);
		System.out.println("No. of Students :"+ students);
		System.out.println("department :"+ department);
		System.out.println("Address :"+ address);
		System.out.println("Email ID :"+ email);
		System.out.println("====================================");
	}
}
