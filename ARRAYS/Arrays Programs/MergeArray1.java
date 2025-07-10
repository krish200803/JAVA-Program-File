
//  Write a Program for Merging of Two Arrays [ LOGIC 2]

package ARRAYS.Programs;

import java.util.Arrays;

public class MergeArray1 {
	
	public static void main(String[] args) {
		
		int ar1[] = {10,20,30,40,50,60};
		
		int ar2[] = {70,80,90,100};
		
		System.out.println(Arrays.toString(mergeArr(ar1, ar2)));

	}
	
	public static int[] mergeArr(int ar1[], int ar2[])
	{
		int ans[] = new int[ar1.length + ar2.length];
		
		for(int i = 0; i<ans.length; i++)                 // Using only one Loop
		{
			if(i<ar1.length)
			{
				ans[i] = ar1[i];
			}
			else
			{
				ans[i] = ar2[i - ar1.length];
			}
		}
		return ans;
	}

}
