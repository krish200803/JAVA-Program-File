import java.util.Scanner;
class NextPrimeNum                         // make the number prime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		boolean flag = true;

			for(int i=2; i<num ; i++)
			{
				if(num%i == 0)
				{
					flag = false;
					num++;
					i=2;
				}
			}

			Sysem.out.println("num "+num);
	}
}
