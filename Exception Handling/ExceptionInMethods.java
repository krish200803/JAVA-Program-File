package ExceptionHandling;

public class ExceptionInMethods {         // Exception Object Propagation  

	public static void main(String[] args) {
	
		try 
		{
			division(10,0);                     // Calling Method
		} 
		catch (ArithmeticException ref) {
			System.out.println("Don't put second parameter as 0 or Don't divide by Zero");
		}                           

	}
	
	public static void division(int a, int b)    // Called Method
	{
		System.out.println(a/b);
	}

}


// Exception Object Propagation -> It is the process of movement of Exception Object reference from Called Method
//								   to the Calling Method when there is a situation when an Exception is not handled 
//								   an called Method ( due to some methods being private ) is known as 
//								   Exception Object Progation.