
//	Write a Program to Find the missing Number in the Array . 

package ARRAYS.Programs;

public class FindMissingNum {

	public static void main(String[] args) {
	
		int a[] = {1,6,2,4,5,3,8};        
		
		missingNum(a);                  // Output : 7

	}
	
//  Here We have used the formula of N natural Number to find the Missing Element i.e n(n+1)/2 where n 
//	is Maximum nunber in Array.
	
//	But this formula and this Problem can only find ONE MISSING ELEMENT it can't find the 2 Element .
	
	public static void missingNum(int a[])
	{
//		int max = -2147483648;   
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			sum += a[i];
			
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		int sumOfNatural = max*(max+1)/2;
		
		System.out.println("The Missing Number is : " + (sumOfNatural - sum));
		
	}
	

}
