package Inheritance.InstanceOfOperator;

public class FatherSonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s1 = new Son();
		
		System.out.println(s1 instanceof Son);            // True
		System.out.println(s1 instanceof Father);         // True
		 
		Father f1 = new Father();
		
		System.out.println(f1 instanceof Son);            // False
		System.out.println(f1 instanceof Father);         // True
		
		System.out.println(f1 instanceof ABC);            // CTE
		
	}

}
