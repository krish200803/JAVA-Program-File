import java.util.Scanner;
class Kilogram 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Weight in Pounds :");
		float pound = sc.nextFloat();

		float kilo = pound * 0.454f;
		System.out.println("The Weight in Kilogram is :"+ kilo); 
	}
}
