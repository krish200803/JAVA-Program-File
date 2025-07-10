
//  Write a Program for Merging of Two Arrays [ LOGIC 1]

package ARRAYS.Programs;

import java.util.Arrays;

public class MergeArray {
	
	public static void main(String[] args) {
		
		int ar1[] = {10,20,30,40,50,60};
		
		int ar2[] = {70,80,90,100};
		
		System.out.println(Arrays.toString(mergeArr(ar1, ar2)));

	}
	
	public static int[] mergeArr(int ar1[], int ar2[])
	{
		int ans[] = new int[ar1.length + ar2.length];
		
		int mem = 0;
		 
		for(int i = 0; i<ar1.length;i++, mem++)             // Using Two Loop
		{
			ans[mem] = ar1[i];
		}
		
		for(int i = 0; i<ar2.length; i++, mem++)
		{
			ans[mem] = ar2[i];
		}
		
		return ans;
	}

}
