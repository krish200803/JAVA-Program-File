import java.util.Scanner;
class ProductOfNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem = 0;
		int product = 1;

		rem = num % 10;      // 1234 => 4
		product = product * rem;

		num = num / 10;      // 1234 => 123                                   //  ONLY FOR FOUR DIGIT NUMBER
		rem = num % 10;      // 123 => 3
		product = product * rem;

		num = num / 10;      // 123 => 12
		rem = num % 10;      // 12  => 2 
		product = product * rem;

		num = num / 10;      // 12 => 1
		rem = num % 10;       // 1 => 1
		product = product * rem;


		System.out.println("Product of Num is :"+ product);
	}
}
