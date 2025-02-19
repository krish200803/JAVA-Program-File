import java.util.Scanner;
class LargestDgt
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int  num = sc.nextInt();
		int max = 0;
		int min = 0;
		for(int i = num; i>0; i/=10)
		{
			int dgt = i%10;
			if(max<dgt)
			{
				max = dgt;
			}
			if(min>dgt)
			{
				min = dgt;
			}
			System.out.println(dgt+ " : " + max);
			System.out.println();
			
			System.out.println(dgt+ " : " + min);
		}
		System.out.println("The lagest number in "+ num +" is "+ max);
		System.out.println("The Smallest number in "+ num +" is "+ min);
	}
}

