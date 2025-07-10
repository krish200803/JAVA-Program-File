
// Write a program to merge the two Array where the 1st array should be same and 2nd array should be reverse

package ARRAYS.Programs;

import java.util.Arrays;

public class OneArrayReverse {
	
	public static void main(String[] args) {
		
		int ar1[] = {10,20,30,40,50,60};
		
		int ar2[] = {70,80,90,100,110,120,130,140,150};
		
		System.out.println(Arrays.toString(oneArrayRev(ar1, ar2)));

	}
	
	public static int[] oneArrayRev(int ar1[], int ar2[])
	{
		int ans[] = new int[ar1.length + ar2.length];
		
		for(int i=0; i<ans.length; i++)                // Using one Loop
		{
			if(i<ar1.length)
			{
				ans[i] = ar1[i];
			}
			else
			{
				ans[i] = ar2[ans.length - 1 - i];
			}
		}
		return ans;
	}

}
