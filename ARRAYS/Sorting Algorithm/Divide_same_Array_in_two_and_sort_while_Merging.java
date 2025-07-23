
// Take one Array and divide it into two and then Sort it while Merging it in othe Array

package ARRAYS.Sorting_Algorithm;

import java.util.Arrays;

public class Divide_same_Array_in_two_and_sort_while_Merging {

	public static void main(String[] args) {
		
		int a[] = {3,5,9,15,18,20,8,9,12,17,19,21,25}; // o/p -> [3, 5, 8, 9, 9, 12, 15, 17, 18, 19, 20, 21, 25]
		
		System.out.println("Sorted Array while Merging is : "+Arrays.toString(divide_sort_merge(a)));
		
	}

	public static int[] divide_sort_merge(int a[])
	{
		int ans[] = new int[a.length];
		int i = 0, j = a.length/2, k = 0;
		
		while(i < a.length/2 && j < a.length)
		{
			if(a[i] <= a[j])
			{
				ans[k] = a[i];
				k++;
				i++;
			}
			else if(a[i] > a[j])
			{
				ans[k] = a[j];
				k++;
				j++;
			}
		}
		while(i < a.length/2)
		{
			ans[k] = a[i];
			k++;
			i++;
		}
		while(j < a.length)
		{
			ans[k] = a[j];
			k++;
			j++;
		}
		return ans;
	}
	
}
