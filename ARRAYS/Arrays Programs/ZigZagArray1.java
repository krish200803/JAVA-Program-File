
// Write a Program to arrange the 2 Array elements in the Zig Zag format in Array  [ LOGIC 2 ]

package ARRAYS.Programs;

import java.util.Arrays;

public class ZigZagArray1 {

	public static void main(String[] args) {
		
		int ar1[] = {10,20,30,40,50,60};
		
		int ar2[] = {70,80,90,100};
		
		System.out.println(Arrays.toString(zigZagMerge(ar1, ar2)));

	}
	
	public static int[] zigZagMerge(int ar1[], int ar2[])
	{
		int ans[] = new int[ar1.length + ar2.length];
		
		int mem = 0;

		if(ar1.length > ar2.length)
		{
			for(int i = 0; mem < ans.length; i++)
			{
				if(i<ar2.length)
				{
					ans[mem] = ar1[i];
					ans[mem + 1] = ar2[i];
					mem += 2;
				}
				else
				{
					ans[mem] = ar1[i];
					mem++;
				}
			}
		}
		else if(ar2.length > ar1.length)
		{
			for(int i = 0; mem < ans.length; i++)
			{
				if(i<ar1.length)
				{
					ans[mem] = ar1[i];
					ans[mem + 1] = ar2[i];
					mem += 2;
				}
				else
				{
					ans[mem] = ar2[i];
					mem++;
				}
			}
		}
		else
		{
			for(int i=0; mem<ans.length;i++, mem += 2)
			{
				ans[mem] = ar1[i];
				ans[mem + 1] = ar2[i];
			}
		}
		return ans;
	}
	

}
