package ObjectClass.ToString;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Umesh", "COEP", 1234, "BE", "Computer");
		
		Student s2 = new Student("Nanish", "AIIMS", 1234, "MBBS", "Neurologist");
		
//		When we print the object we get the reference of that object , but when we override the toString() method 
//		then we can customize the reference of that object which will get printed
		
//		Therefore, the role of the toString() method of the an object class is to give the object reference that is
//		<getClass().getName() + "@" + Integer.toHexString(hashCode())> (format of object reference ) for every object
//		which is created anf if we don't want that reference we can costomize it by overriding toString() method. 
		
		System.out.println(s1);       
		System.out.println(s2);
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
	}

}
