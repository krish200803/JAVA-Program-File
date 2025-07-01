package ExceptionHandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		
		System.out.println("Main() Starts");
		
		try 
		{
			String s = null;                              // Exception has occured
			System.out.println(s.length());
		} 
		catch (NullPointerException ref) 
		{
			System.out.println("Object Reference is Pointing Towards Null");
			try                                                               // Nested try Catch finally Block 
			{ 
				System.out.println(10/0);                 // Exception has occured
			} 
			catch (ArithmeticException ref1) {
				System.out.println("Dont Divide by Zero");
			}
			finally
			{
				try 
				{
					System.out.println(10/0);             // Exception has occured
				} 
				catch (ArithmeticException ref3) {
					System.out.println("Don't Divide by Zero");
				}
				System.out.println("Inner Finally Block");
			}
		}
		finally                                           // Finally Block will get executed at any cost
		{
			System.out.println("Finally Block Executed");
		}
		System.out.println("Main() Ends");

	}

}
