package ObjectClass.HashCode;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Student s1 = new Student("Umesh", "COEP", 1234, "BE", "Computer");
		
		Student s2 = new Student("Manish", "AIIMS", 1234, "MBBS", "Neurologist");
		
		System.out.println("--------------- toString() Method -------------------");
		System.out.println();
		
//		When we print the object we get the reference of that object , but when we override the toString() method 
//		then we can customize the reference of that object which will get printed
		
//		Therefore, the role of the toString() method of the an object class is to give the object reference that is
//		<getClass().getName() + "@" + Integer.toHexString(hashCode())> (format of object reference ) for every object
//		which is created anf if we don't want that reference we can costomize it by overriding toString() method. 
		
		System.out.println(s1);       
		System.out.println(s2);
		
		System.out.println(s1==s2);     // here the equal operetor compare the two object by its original reference 
										//  therefore the output of  FALSE
		
		System.out.println(s1.equals(s2)); // here we have overrided but the attributes of the two objects are different. 
		System.out.println();		       //   Therefore the output is FALSE
		
		
		
		
		System.out.println("--------------- equals() Method -------------------");
		System.out.println();
		
		Student s3 = new Student("Umesh", "COEP", 1234, "BE", "Computer");
		
		Student s4 = new Student("Umesh", "COEP", 1234, "BE", "Computer");
		
		System.out.println(s3);       
		System.out.println(s4);
		
		
//		equals operator(==) as well as equals() method is used to compare the two object by their references 
//		not by their Attributes.
		
		System.out.println(s3==s4);     // here the equal operetor compare the two object by its original reference 
										//  therefore the output of  FALSE
		
//		But we can override the equals() method of Object class that will compare the two Objects by their attributes
//		not by their references.
		
		System.out.println(s3.equals(s4));  // here we have overrided the equals() Method so, attributes of the 
		                    				// two objects are Same. Therefore the output is TRUE 
		
		
		
		System.out.println("--------------- hashcode() Method -------------------");
		System.out.println();
		
		Student s5 = new Student("Umesh", "COEP", 1234, "BE", "Computer");
		
		Student s6 = new Student("Umesh", "COEP", 1234, "BE", "Computer");
		
		System.out.println(s5);       // object reference
		System.out.println(s6);       // object reference
		
		System.out.println(s5.hashCode());   // prints hashcode of object
		System.out.println(s6.hashCode());   // prints hashcode of object
		
		System.out.println(s5==s6);       // here the equal operetor compare the two object by its original reference 
										  //  therefore the output of  FALSE
		
		System.out.println(s5.equals(s6));  // here we have overrided the equals() Method so, attributes of the 
											// two objects are Same. Therefore the output is TRUE
		
		
		
											


	}

}
