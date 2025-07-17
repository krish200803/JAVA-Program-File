
//	Write a program to print the elements which are Repeated in an Array 

//              eg. {1,2,1,2,1,2,3,2,6,7};   ->  [1,2]


package ARRAYS.Programs;

import java.util.Arrays;

public class Print_Element_which_are_repeated_in_Array {
	
	public static void main(String[] args) {
		
		int [] a = {1,2,1,2,1,2,3,2,6,7};   // ->  [1,2]
		
//		int freq[] = frequency(a);
//		
//		System.out.println(Arrays.toString(a));
//		
//		for(int i=0; i<freq.length; i++)
//		{
//			if(freq[i] != -1)
//			{
//				System.out.println(a[i]+ " is Repeated "+ freq[i]+ " times");
//			}
//		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(frequency(a)));
		
		System.out.println(Arrays.toString(print_Repeated_Elements(a)));  // ->  [1,2]
		
	}
	
	
	public static int[] print_Repeated_Elements(int a[])
	{
		int freq[] = frequency(a);  //   freq[] = [2, 3, -1, -1, -1, -1, 0, -1, 0, 0]
		
		int zeroCount = 0;
		
		for(int i = 0; i<freq.length; i++)
		{
			if(freq[i] > 0)
			{
				zeroCount++;
			}
		}
		
		int ans[] = new int [zeroCount];
		
		for(int i=0, j=0; i<a.length; i++)
		{
			if(freq[i] > 0)
			{
				ans[j] = a[i];
				j++;
			}
		}
		return ans;      // [1, 2]
	}
	
	public static int[] frequency(int [] a)
	{
		int count[] = new int[a.length];
		
		for(int i = 0; i<a.length; i++)
		{
			int ct = 0;
			
			if(count[i] != -1)
			{
				for(int j = i+1; j<a.length;j++)
				{
					if(a[i] == a[j])
					{
						ct++;
						count[j] = -1;
					}
				}
				count[i] = ct;
			}
		}
		return count;   //  [1, 2, 1, 2, 1, 2, 3, 2, 6, 7] o/p -> [2, 3, -1, -1, -1, -1, 0, -1, 0, 0]
	}

}
