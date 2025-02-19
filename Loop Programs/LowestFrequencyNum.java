import java.util.Scanner;
class LowestFrequencyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		long num = sc.nextLong();
		int dgt = 0;
		int mincnt = 9;

		for(int i = 0 ; i<=9; i++)
		{
			int cnt = 0;
			for(long j = num; j>0; j/=10)
			{
				long rem = j%10;
				if(i==rem)
				{
					cnt++;
				}
			}
			if(cnt!=0)
			{
				if(mincnt > cnt)
				{
					mincnt = cnt;
					dgt = i;
				}
			}
		}
		System.out.println("The minimum Digit is "+ dgt +" with Frequency of "+ mincnt );
	}
}
