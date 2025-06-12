package Inheritance.DerivedTypecasting.DownCasting;

public class FatherSonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Father f1 = new Son();  // Up Casting -> In this the Property of SubClass i.e Son() is Stored or converted 
//								               to Parent Class i.e Father. Son have property of Smoking as well as 
//		                                       Drinking but when it gets Stored in Parent it will loose its one property
//		                                       i.e Smoking he only have the property of Drinking.	
		
		Son s1 = (Son)f1;    // Down Casting -> In this the convert or Store the Upcasted reference i.e ( Property 
//		                                  of SubClass i.e Son() is Stored or converted to Parent Class i.e Father) to 
//		                                  its respective Subclass type. In this the Son will again have his All property
//		                                  i.e Smoking() and Drinking() again.
		
		s1.drinking();
		s1.Smoking();     
		
//---------------------------------------------------------------------------------------
		
//		Father f2 = new Father();           // Class Cast exception
//		Son s1 = (Son)f2;
		
//---------------------------------------------------------------------------------------	
		
		

	}

}
