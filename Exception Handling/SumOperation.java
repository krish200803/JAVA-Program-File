package ExceptionHandling;

import java.util.InputMismatchException;       
import java.util.Scanner;

public class SumOperation {

	public static void main(String[] args) {    // try with multiple catch Block 
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the First number");
			int num = sc.nextInt();
			
			System.out.println("Enter the Second Number");
			int den = sc.nextInt();
			
			int ans = num/den;
			System.out.println(ans);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Don't Divide By Zero");
		}
		catch(NullPointerException ref)
		{
			System.out.println("Object reference is Pointing towards Null");
		}
		catch(InputMismatchException ref)
		{
			System.out.println("Invalid Input");
		}

	}

}
