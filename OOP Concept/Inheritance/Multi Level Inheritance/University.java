package Inheritance.MultiLevel;

import java.util.ArrayList;

public class University {
	private String name;
	private int code;
	private int numbercolleges;
	
	private ArrayList<String> course = new ArrayList<String>(); 
	private String director;
	private String address;
	private long contact;
	private String email;
	
	public University() {
		super();
	}

	public University(String name, int code, int numbercolleges, ArrayList<String> course, String director,
			String address, long contact, String email){
		super();
		this.name = name;
		this.code = code;
		this.numbercolleges = numbercolleges;
		this.course = course;
		this.director = director;
		this.address = address;
		this.contact = contact;
		this.email = email;
		
	}
	
	public void displayUniversity()
	{
		System.out.println("------------- University Details --------------");
		System.out.println("Name :"+ name);
		System.out.println("Code :"+ code);
		System.out.println("Colleges :"+ numbercolleges);
		System.out.println("Courses :"+ course);
		System.out.println("director :"+ director);
		System.out.println("Address :"+ address);
		System.out.println("Contact :"+ contact);
		System.out.println("Email ID :"+ email);
		System.out.println("================================================");
	}
}



	
