/*import java.util.Scanner;
class PrimeFactor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int cnt = 0;
		for(int i=2; i<num ; i++)
		{
			if(num%i==0)
			{
				for(int j=2; j<num; j++)
				{
					cnt++;
					//System.out.print(i+" ");
					if(cnt==0)
					{
					System.out.print(i+" ");
				}	
				}
			}
		}

	}
}*/

import java.util.Scanner;
class PrimeFactor
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter The number :");
      int num = input.nextInt();     
      for(int i = 2; i< num; i++) {
         while(num%i == 0) {
            System.out.println(i+" ");
            num = num/i;
         }
      }
      if(num >2) {
         System.out.println(num);
      }
   }
}
 
