import java.util.Scanner;
class PrimeFactor  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int cnt = 0;
		//for(int i=2; i<=num ; i++)
		//{
			//if(num%i==0)
				//System.out.print(i+" ");
		//}
		for(int i=2; i<num;i++)
		{
			if(num%i==0)
			{
				cnt++;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		//System.out.println(cnt==0?(num+" is a Prime Number "):(num+" is not a Prime Number "));

	}
}
