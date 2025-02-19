import java.util.Scanner;
class KrishnamurthyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int sum =0;
		int dup = num;

		while(num>0)
		{
			int rem = num%10;
			int fact = 1;
			for(int i = 1; i<=rem; i++)
				fact *= i;

			sum += fact;
			num /= 10;
		}
		System.out.println(dup == sum? dup+" is an Krishnamurthy Number" : dup+" is not an Krishnamurthy Number");
	}
}
