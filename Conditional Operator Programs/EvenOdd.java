import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		int num = sc.nextInt();

		// num/2  == num/2.0;
		// (num/2)*2 == num 
		// num % 2 == 0

		// to check if the num is even or odd without using Modulo(%) and Bitwise operator
		System.out.println((num/2) == (num/2.0) );
		System.out.println((num/2)*2 == num);
		System.out.println(num % 2 ==0);
	}
}
