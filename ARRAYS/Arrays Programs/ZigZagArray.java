
// Write a Program to arrange the 2 Array elements in the Zig Zag format in Array  [ LOGIC 1 ]

package ARRAYS.Programs;

import java.util.Arrays;

public class ZigZagArray {
	
	public static void main(String[] args) {
		
		int ar1[] = {10,20,30,40,50,60,70};
		
		int ar2[] = {70,80,90,100,110};
		
		System.out.println(Arrays.toString(zigZagMerge(ar1, ar2)));

	}
	
	public static int[] zigZagMerge(int ar1[], int ar2[])
	{
		int ans[] = new int[ar1.length + ar2.length];
		
		int mem = 0;
		
		// From if elseif else condition only only condition will be execute bases on the Array Size
		
		if(ar1.length > ar2.length)                       
		{
			int i;
			for(i=0; i<ar2.length;i++, mem += 2)
			{
				ans[mem] = ar1[i];
				ans[mem + 1] = ar2[i];
			}
			while(i<ar1.length)
			{
				ans[mem] = ar1[i];
				i++;
				mem++;
			}
		}
		else if(ar2.length > ar1.length)
		{
			int i;
			for(i=0; i<ar1.length;i++, mem += 2)
			{
				ans[mem] = ar1[i];
				ans[mem + 1] = ar2[i];
			}
			while(i<ar2.length)
			{
				ans[mem] = ar2[i];
				i++;
				mem++;
			}
		}
		else
		{
			int i;
			for(i=0; i<ar1.length;i++, mem += 2)
			{
				ans[mem] = ar1[i];
				ans[mem + 1] = ar2[i];
			}
		}
		return ans;
	}


}
