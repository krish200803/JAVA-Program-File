
// Write a Program by reversing both array and merge them 

package ARRAYS.Programs;

import java.util.Arrays;

public class BothArrayReverseMerge {
	
	public static void main(String[] args) {
		
		int ar1[] = {10,20,30,40,50};
		
		int ar2[] = {70,80,90,100,110};
		
		System.out.println(Arrays.toString(bothArrayRev(ar1, ar2)));

	}
	
	public static int[] bothArrayRev(int ar1[], int ar2[])
	{
		int ans[] = new int[ar1.length + ar2.length];
		
		for(int i=0; i<ans.length; i++)                       // Using one Loop
		{
			if(i<ar1.length)
			{
				ans[i] = ar1[ar1.length - 1 - i];
			}
			else
			{
				ans[i] = ar2[ans.length - 1 - i];
			}
		}
		return ans;
	}

}
