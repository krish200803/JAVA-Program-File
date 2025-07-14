
//	Write a Program to Remove the Element from the Array ( This program will only remove one Element)

package ARRAYS.Programs;                        // By passing the Element that we have to Remove

import java.util.Arrays;

public class RemoveAnElement {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		
		System.out.println(Arrays.toString(removeEle(a, 3)));

	}
	
	public static int[] removeEle(int a[], int ele)
	{
		int i;
		for(i = 0; i<a.length ; i++)
		{
			if(a[i] == ele)
			{
				break;
			}
		}
		
		if(i < a.length)  // this will be false if the Element is not present in Array and the Same Array will Return
		{
			int ans[] = new int[a.length-1];
			
			for(int j = 0; j < a.length; j++)
			{
				if(i > j)
				{
					ans[j] = a[j];
				}
				else if(i < j)
				{
					ans[j-1] = a[j];
				}
			}
			return ans;
		}
		return a;
	}

}
