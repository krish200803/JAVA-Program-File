
//	Write a Program to Keep Only Repeated Elements in An Array and Reove Other Elements

//               [1,2,1,2,1,2,3]  O/P ->  [1, 2, 1, 2]

package ARRAYS.Programs;

import java.util.Arrays;

public class Keep_Only_Repeated_Remove_Other_Element {

	public static void main(String[] args) {
		
		int [] a = {1,2,1,2,1,2,3};    //  o/p  [2, 2, -1, -1, -1, -1, 0] ->  [1, 2, 1, 2]
		
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.toString(frequencyOfEle(a)));
		
		System.out.println(Arrays.toString(keepDuplicates(a)));
		

	}
	
	public static int[] keepDuplicates(int[] a)
	{
		int freq[] = frequencyOfEle(a);     //   freq[] = [2, 3, -1, -1, -1, -1, 0, -1, 0, 0]
		
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
			if(freq[i] == -1)
			{
				ans[j] = a[i];
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
		return count;      //  [1, 2, 1, 2, 1, 2, 3, 2, 6, 7] o/p -> [2, 3, -1, -1, -1, -1, 0, -1, 0, 0]
	}

}
