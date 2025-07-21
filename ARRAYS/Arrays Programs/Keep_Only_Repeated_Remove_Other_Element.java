
//	Write a Program to Keep Only Repeated Elements in An Array and Remove Other Elements 

//               [1,2,1,2,1,2,3]  O/P ->  [1, 2, 1, 2]

package ARRAYS.Programs;

import java.util.Arrays;

public class Keep_Only_Repeated_Remove_Other_Element {

	public static void main(String[] args) {
		
		int [] a = {1,2,1,2,1,2,3};    //  o/p  [2, 2, -1, -1, -1, -1, 0] ->  [1, 2, 1, 2]
		
		System.out.println("a[] : "+Arrays.toString(a));
		
		System.out.println("freq[] : "+Arrays.toString(frequencyOfEle(a)));
		
		System.out.println("ans[] : "+Arrays.toString(keepDuplicates_Repeated(a)));
		

	}
	
	public static int[] keepDuplicates_Repeated(int[] a)
	{
		int freq[] = frequencyOfEle(a);     //   freq[] = [2, 2, -1, -1, -1, -1, 0]
		
		int negCount = 0;
		
		for(int i = 0; i<freq.length; i++)
		{
			if(freq[i] == -1)
			{
				negCount++;
			}
		}
		
		int ans[] = new int[negCount];
		
		for(int i=0, j=0; i<a.length; i++)
		{
			if(freq[i] == -1)                          // a[] :    [1, 2, 1, 2, 1, 2, 3]
			{                                          // freq[] : [2, 2, -1, -1, -1, -1, 0]
				ans[j] = a[i];                         // ans[] :  [1, 2, 1, 2]
				j++;
			}
		}
		return ans;           //  [1, 2, 1, 2]
	}

	public static int[] frequencyOfEle(int a[])  
	{
		int count[] = new int[a.length];
		
		for(int i = 0; i < a.length; i++)
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
		return count;      //  [1, 2, 1, 2, 1, 2, 3] o/p -> [2, 2, -1, -1, -1, -1, 0]
	}

}
