
//	Write a Program to Print only the Unique Element in The Array

//              [1,2,3,4,1,2,3,5,4,6] -> o/p ->  [5, 6]

package ARRAYS.Programs;

import java.util.Arrays;

public class Print_Element_Which_Are_Unique_in_Array {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,1,2,3,5,4,6};     // o/p ->  [5, 6]
		
		System.out.println("a[] : "+Arrays.toString(a));
		
		System.out.println("freq[] : "+Arrays.toString(frequency(a)));
		
		System.out.println("ans[] : "+Arrays.toString(uniqueElement(a)));

	}
	
	public static int[] uniqueElement(int a[])
	{
		int freq[] = frequency(a);        // [1, 1, 1, 1, -1, -1, -1, 0, -1, 0]
		
		int zeroCount = 0;
		
		for(int i=0; i<freq.length; i++)
		{
			if(freq[i] == 0)
			{
				zeroCount++;
			}
		}
		
		int ans[] = new int[zeroCount];
		
		for(int i=0, j=0; i<a.length; i++)
		{
			if(freq[i] == 0)                  //  a[] : [1, 2, 3, 4, 1, 2, 3, 5, 4, 6]
			{                                 //  freq[] : [1, 1, 1, 1, -1, -1, -1, 0, -1, 0]
				ans[j] = a[i];                //  ans[] : [5, 6]
				j++;
			}
		}
		return ans;   // o/p [5, 6]
		
	}
	
	
	public static int[] frequency(int a[])
	{
		int count[] = new int[a.length];
		
		for(int i=0; i<a.length; i++)
		{
			int ct = 0;
			
			if(count[i] != -1)
			{
				for(int j = i+1; j<a.length; j++)
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
		return count;              // [1,2,3,4,1,2,3,5,4,6] -> [1, 1, 1, 1, -1, -1, -1, 0, -1, 0]
		
	
		
	}

}
