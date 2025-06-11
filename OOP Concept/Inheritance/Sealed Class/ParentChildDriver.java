package Inheritance.SealedClass;

public class ParentChildDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c1 = new Child1();
		
		System.out.println(c1.name);
		
		c1.displayParent();
		
		System.out.println("------------------------");
		
		Child2 c2 = new Child2();
		
		System.out.println(c2.age);
		
		c2.displayParent();
		c2.displayParent();
	}

}
