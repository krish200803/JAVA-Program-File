package ARRAYS;

public class Student {
	
	String name;
	String coll;
	int age;
	int id;
	
	
	public Student(String name, String coll, int age, int id)
	{
		super();
		this.name = name;
		this.coll = coll;
		this.age = age;
		this.id = id;
	}
	
	
	// Here toString() Method has Overrided due to we want to print the Attributes instead of Reference
	
	public String toString()    
	{
		return "[" + "Name :"+ name + " coll :"+ coll +" Age :"+ age+" ID :"+ id+ "]";
	}

}
