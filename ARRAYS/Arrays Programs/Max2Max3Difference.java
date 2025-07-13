
//	Write a Program to find the Difference between 2nd Max and 3rd Max Element in Array

package ARRAYS.Programs;

//import java.util.Scanner;

public class Max2Max3Difference {

	public static void main(String[] args) {

//		int a[] = new int[30];
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i = 0; i< a.length; i++)
//		{
//			a[i] = sc.nextInt();
//		}
		
		int a[] = {10,3,53,41,37,38,14,33,1};
		
		int sum1 = sum(a);
		
		System.out.println(sum1);
		

	}
	
	public static int sum(int a[])
	{
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		
		for(int i = 0; i<a.length; i++)
		{
			if(a[i] > max1)
			{
				max3 = max2;
				max2 = max1;
				max1 = a[i];
			}
			else if(a[i] > max2)
			{
				max3 = max2;
				max2 = a[i];
			}
			else if(a[i] > max3) 
			{
				max3 = a[i];
			}
		}
		return max2 - max3;
	}

}
