package ExceptionHandling;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Scanner sc = null;     // "Null Pointer Exception "
		
		System.out.println("Enter the First Number: ");
		
		int num = sc.nextInt();
		
		System.out.println("Enter the Second Number: ");
		
		int den = sc.nextInt();
		
//		int ans = num/den;          To avoid Exception we put do exception Handling Here by using Try Catch Block	
//		System.out.println(ans);
		
		try {
			int ans = num/den;
			System.out.println(ans);
		}
		catch(ArithmeticException ref)
		{
			System.out.println(ref);   // java.lang.ArithmeticException: / by zero
			
			System.out.println(ref.getClass().getName() + "@" + Integer.toHexString(ref.hashCode())); 
			                                                  //java.lang.ArithmeticException@7a07c5b4
			
			System.out.println("Don't divide by Zero");
		}
		
		System.out.println("Thankyou !!!");
		
	
	}

}

//  If both or any one of the i.e num or den has the datatype double or Float and we divide any number by 0 the 
//  output will be "Infinity" displayed on the Screen instead of Arithmetic Exception.

//										and
										
//if we have num and den Both Int and then there will an Exception Displayed on the Screen i.e 
//							"Arithmetic Exception"

//										and
										
//Instead of Int we Give the Input as Float then there will be an Exception on the Screen i.e 
//							"Input Mismatch Exception"

// So there will be three Exception in this Simple Program 
//				1. "Null Pointer Exception "
//				2. "Arithmetic Exception"
//				3. "Input Mismatch Exception"