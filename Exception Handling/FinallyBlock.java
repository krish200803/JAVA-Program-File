package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("Main() Starts");
		
		try 
		{
			String s = null;
			System.out.println(s.length());
		} 
		catch (NullPointerException ref) 
		{
			System.out.println("Object Reference is Pointing Towards Null");
			System.out.println(10/0);       // Exception has occured
		}
		finally                             // Finally Block will get executed at any cost
		{
			System.out.println("Finally Block Executed");
		}
		System.out.println("Main() Ends");

	}

}
