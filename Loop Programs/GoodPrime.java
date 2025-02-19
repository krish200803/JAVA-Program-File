import java.util.Scanner;
class GoodPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int cnt = 0;
		for(int i=2;i<=n;i++)
		{
			boolean flag = true;
			for(int j=2;j*j<=i;j++){
				if((i%j)==0){
					flag = false;
					break;
				}
			}
			if(flag){
				int num = i;
				System.out.print(i+" ");
				boolean flag1 = true;

				while(num>0){
					int rem = num%10;
					if(rem != 2 && rem != 3 && rem != 5 && rem != 7){
						flag1 = false;
						break;
					}
					num/=10;
				}
				if(flag1)
					cnt++;
			}
		}
		System.out.println();
		System.out.println("Count of Good Prime NUmbers from 1 to "+ n +" is "+cnt);
	}
}