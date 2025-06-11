package Inheritance.SealedClass;

public sealed class Parent permits Child1 , Child2 {
	
	String name = "Kaju";
	int age = 50;
	
	public void displayParent()
	{
		System.out.println("Name :"+ name);
		System.out.println("Age :"+ age);
	}

}
