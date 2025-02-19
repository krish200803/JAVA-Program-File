import java.util.Scanner;
class NeonNum 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int sqr = num*num;
		int sum =0;
		System.out.println(sqr);

		for(int i = sqr ; i>0; i/=10)
			sum = sum + (i%10);
		System.out.println(sum);

		if(num == sum)
			System.out.println(num+" is a Neon Number");
		else
			System.out.println(num+" is a Neon Number");
	}
}
