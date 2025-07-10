
// Perform an Half Reverse Operation on an Array [ LOGIC 2 ]

package ARRAYS.Programs;

import java.util.Arrays;

public class HalfReverse1 {
	
	public static void main(String[] args) {
		
		int ar[] = {10,20,30,40,50,60,70};
		
		System.out.println(Arrays.toString(halfRev(ar)));

	}
	
	public static int[] halfRev(int ar[])
	{
		int ans[] = new int [ar.length];
		
		for(int i = 0; i<ar.length/2; i++)           // Using two Loop
		{
			ans[i] = ar[i];
		}
		
		for(int i = ar.length-1, j = ans.length/2; i>=ar.length/2; i--, j++)
		{
			ans[j] = ar[i];
		}
		
		return ans;
	}

}
