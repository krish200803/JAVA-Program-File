
//	Write a program to remove the elements between the range of index

package ARRAYS.Programs;

import java.util.Arrays;

public class Remove_ArrayEle_in_Range {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9};          // start = 3, end = 6
		
		System.out.println(Arrays.toString(removeArrayElementinRange(a, 3, 6)));  // remove element till end_index
		
		System.out.println(Arrays.toString(removeArrayElementinRange(a, 3, 6, true))); //remove end_index element also

	}
	
	// this method is for if we want to remove till the end_index element 
	
	public static int[] removeArrayElementinRange(int a[], int start_index, int end_index)
	{
		if(start_index >= 0 && end_index < a.length && start_index < end_index)
		{
			int ans[] = new int[a.length - (end_index-start_index)];
			
			for(int i=0; i<a.length;)
			{
				if(i < start_index)
				{
					ans[i] = a[i];
					i++;
				}
				else if(i == start_index)
				{
					i = i + (end_index - start_index);
				}
				else if(i >= end_index)
				{
					ans[i - (end_index - start_index)] = a[i];
					i++;
				}
			}
			return ans;
		}
		return null;
	}
	
	// this method is for if we want to remove the end_index element 
	
	public static int[] removeArrayElementinRange(int a[], int start_index, int end_index, boolean inc)
	{
		if(inc)
		{
			return removeArrayElementinRange(a, start_index, end_index + 1);
		}
		return removeArrayElementinRange(a, start_index, end_index);
	}

}
