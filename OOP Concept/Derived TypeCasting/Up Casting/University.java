package Inheritance.DerivedTypecasting.Upcasting;

public class University {
	
	String name;
	int numbercolleges;
	String course;
	String address;
	long contact;
	String email;
	

	public University(String name, int numbercolleges,String course,String address, long contact, String email){
		super();
		this.name = name;
		this.numbercolleges = numbercolleges;
		this.course = course;
		this.address = address;
		this.contact = contact;
		this.email = email;
		
	}
	
	public void displayUniversity()
	{
		System.out.println("------------- University Details --------------");
		System.out.println("Name :"+ name);
		System.out.println("Colleges :"+ numbercolleges);
		System.out.println("Courses :"+ course);
		System.out.println("Address :"+ address);
		System.out.println("Contact :"+ contact);
		System.out.println("Email ID :"+ email);
		System.out.println("================================================");
	}

}
