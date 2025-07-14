
//	Write a program to add the array to an existing array at an index value

package ARRAYS.Programs;

import java.util.Arrays;

public class Add_Array_in_Given_Index {

	public static void main(String[] args) {
		
		int a1[] = {1,2,3,4,5,6,7};
		
		int a2[] = {10,20,30,40,50};
		
		System.out.println(Arrays.toString(addArray(a1, a2, 7)));

	}
	
	public static int[] addArray(int a1[], int a2[], int index)
	{
		int j = 0;
		
		if( index >= 0 && index<=a1.length)
		{
			int ans[] = new int[a1.length + a2.length];
			
			for(int i=0; i<ans.length; i++)
			{
				if(i < index)
				{
					ans[i] = a1[i];
				}
				else if(i < a2.length + index)
				{
					ans[i] = a2[j];
					j++;
				}
				else
				{
					ans[i] = a1[i - a2.length];
				}
				
			}
			return ans;
		}
		return null;
	}
	


}
