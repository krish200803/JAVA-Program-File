
// Perform an Half Reverse Operation on an Array [ LOGIC 1 ]

package ARRAYS.Programs;

import java.util.Arrays;

public class HalfReverse {
	
	public static void main(String[] args) {
		
		int ar[] = {10,20,30,40,50,60};
		
		System.out.println(Arrays.toString(halfRev(ar)));
		
	}
	
	public static int[] halfRev(int ar[])
	{
		int ans[] = new int [ar.length];
		
		for(int i = 0,j = ar.length-1; i<ar.length; i++)         // Using one Loop
		{             
			if(i<ar.length/2)
			{
				ans[i] = ar[i];
			}
			else
			{
				ans[i] = ar[j];
				j--;
			}
		}
		return ans;
	}

}
