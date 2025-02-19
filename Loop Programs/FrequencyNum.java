import java.util.Scanner;
class FrequencyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Long num =sc.nextLong();
		System.out.println(num);
		for(int i=0; i<=9;i++)
		{
			int cnt = 0;
			for(long j=num; j>0; j/=10)
			{
				long rem = j%10;
				if(i==rem)
				{
					cnt++;
				}
			}
			if(cnt != 0)
			{
				System.out.println(i+ " : "+ cnt);
			}
		}
	}
}
