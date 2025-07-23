
//	Merge of Two Array using 2 Pointer in 3rd Array in Sorted Way 

package ARRAYS.Sorting_Algorithm;

import java.util.Arrays;

public class Sorting_Merge_Of_two_Array_Using_2Pointer {

	public static void main(String[] args) {
		
		int a[] = {5,15,18,20,55,60};
		int b[] = {2,3,8,12,19,25,32,50,63};
		
		System.out.println("Sorted Array while Merging is : "+Arrays.toString(merge_Array_by_Sorting(a, b)));	
		
		// o/p -> [2, 3, 5, 8, 12, 15, 18, 19, 20, 25, 32, 50, 55, 60, 63]

	}
	
	public static int[] merge_Array_by_Sorting(int a[], int b[])
	{
		int ans[] = new int[a.length + b.length];
		
		int i=0, j=0, k=0;
		
		while(i<a.length && j<b.length)
		{
			if(a[i] <= b[j])
			{
				ans[k] = a[i];
				k++;
				i++;
			}
			else if(a[i] > b[j])
			{
				ans[k] = b[j];
				k++;
				j++;
			}
		}
		while(i<a.length)
		{
			ans[k] = a[i];
			k++;
			i++;
		}
		while(j<b.length)
		{
			ans[k] = b[j];
			k++;
			j++;
		}
		return ans;
	}

}
