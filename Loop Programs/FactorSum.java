import java.util.Scanner;
class FactorSum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int sum = 0;

		for(int i=1; i<=num ; i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
				sum += i;
			}
		}
		System.out.println();
		System.out.println("Sum of Factor of the Number is :"+ sum);
	}
}
