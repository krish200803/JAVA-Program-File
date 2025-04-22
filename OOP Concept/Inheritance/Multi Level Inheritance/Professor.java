package Inheritance.MultiLevel;

import java.util.ArrayList;

public class Professor extends Department {
	private String name;
	private String designation;
	private String qualification;
	private long contactNumber;
	private String subject;
	
	public Professor() {
		super();
	}
	
	public Professor(String name, String designation, String qualification, long contactNumber, String subject,
											// Department attributes
					String name1, String hod, int staff, int students,   
											// College Attributes
					String collegeName, String code, String grade,  String principal, int students1, 
					ArrayList<String> department, String address, String email,
											// University Attributes
					String name2, int code2, int numbercolleges, ArrayList<String> course, String director,
					String address2, long contact, String email2)
	{
		super(name1, hod, staff, students,  // Department attributes
									// College Attributes
				collegeName, code, grade, principal, students1, department, address, email,
									// University Attributes
				name2, code2, numbercolleges, course, director, address2, contact, email2);

		this.name = name;
		this.designation = designation;
		this.qualification = qualification;
		this.contactNumber = contactNumber;
		this.subject = subject;
	}
	
	public void displayProfessor()
	{
		System.out.println("---------- Professor Details ----------");
		System.out.println("Name :"+ name);
		System.out.println("Designation :"+designation);
		System.out.println("Qualification :"+ qualification);
		System.out.println("Contact Number :"+ contactNumber);
		System.out.println("Subject :"+ subject);
		System.out.println("========================================");
	}
}
