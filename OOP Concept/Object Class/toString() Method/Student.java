package ObjectClass.ToString;

public class Student {
	
	String name;
	String college;
	int roll;
	String degree;
	String stream;
	
	public Student(){
		
	}
	
	public Student(String name, String college, int roll, String degree, String stream)
	{
		super();
		this.name = name; 
		this.college = college;
		this.roll = roll;
		this.degree = degree;
		this.stream = stream;
	}
	
	// Here we have created our own toString() method Other than using toString() method that returns the 
	// Object reference (eg. student@001) , by doing Overriding we have custommize our own Object reference Format  
	
	//	When we print the object we get the reference of that object , but when we override the toString() method 
	//	then we can customize the reference of that object which will get printed
		
	//	Therefore, the role of the toString() method of the an object class is to give the object reference that is
	//	<getClass().getName() + "@" + Integer.toHexString(hashCode())> (format of object reference ) for every object
	//	which is created anf if we don't want that reference we can costomize it by overriding toString() method. 
	
	public String toString()
	{
		return "Name: "+name+ " ,College: "+ college+ " ,roll: "+ roll+ " ,degree: "+ degree+ " ,stream: "+ stream;
	}

}
