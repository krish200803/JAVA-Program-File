import java.util.Scanner;
class PrimeReverseNumPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the NUmber");
		int num = sc.nextInt();
		int rev = 0 ;
		int cnt = 0;
		for(int i=num; i>0; i/=10)
		{
			rev = rev*10 + (i%10);
			//System.out.println(rev);
			for(int j=2; j<i;j++)
			{
				if(rev%j==0)
				{
					cnt++;
				}
			}
		}
		if(cnt==0)
			{
				System.out.println("Number is a prime");
			}
			else{
				System.out.println("Number is not a prime");
			}

	}
}
