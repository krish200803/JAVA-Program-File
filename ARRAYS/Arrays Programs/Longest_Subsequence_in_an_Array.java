
//                        Interview Question 

//		Write a Program to find the Longest Sub-Sequence (Continuation of Repeating Elements) in an Array

//					2 is repeated for 6 times

package ARRAYS.Programs;

public class Longest_Subsequence_in_an_Array {

	public static void main(String[] args) {
		
		int ar[] = {1,2,3,3,3,3,5,5,1,1,1,1,2,2,2,2,2,2};
		
		int max = 0, ct=0, num=0;
		
		for(int i=0; i<ar.length-1; i++)
		{
			if(ar[i] == ar[i+1])
			{
				ct++;
			}
			else
			{
				if(ct > max)
				{
					max = ct;
					num = ar[i];
				}
				ct = 0;
			}
		}
	
		if(ct>max)
		{
			max=ct;
			num=ar[ar.length-1];
		}
		
		if(max > 0)
		{
			System.out.println(num+" is repeated for "+(max+1)+" times");
		}
		else
		{
			System.out.println("No Element Repeated");
		}
	}

}
