
//	Write a progam to Remove the duplicates in an Array

//   [10,20,30,2,40,6,2,10,30] -> [10, 20, 30, 2, 40, 6]

package ARRAYS.Programs;

import java.util.Arrays;

public class Remove_Duplicates_Elements_From_Array {

	public static void main(String[] args) {
		
		int [] a = {10,20,30,2,40,6,2,10,30};  //  [1, 0, 1, 1, 0, 0, -1, -1, -1] -> [10, 20, 30, 2, 40, 6]
		
		System.out.println(Arrays.toString(a));
		
//		System.out.println(Arrays.toString(frequencyOfEle(a)));
		System.out.println(Arrays.toString(Frequency_Of_Each_in_Array.frequencyOfEle(a)));  
		// call frequencyOfEle() method using class name.
		

		
		System.out.println(Arrays.toString(removeDuplicates(a)));

	}
	
	public static int[] removeDuplicates(int[] a)
	{
		int freq[] = Frequency_Of_Each_in_Array.frequencyOfEle(a);  // call frequencyOfEle() method using class name.		
		int negCount = 0;
		
		for(int i = 0; i<freq.length; i++)
		{
			if(freq[i] == -1)
			{
				negCount++;
			}
		}
		
		int ans[] = new int[a.length - negCount];
		
		for(int i=0, j=0; i<a.length; i++)
		{
			if(freq[i] != -1)
			{
				ans[j] = a[i];
				j++;
			}
		}
		return ans;
	}

//	public static int[] frequencyOfEle(int a[])  
//	{
//		int count[] = new int[a.length];
//		
//		for(int i = 0; i < a.length; i++)
//		{
//			int ct = 0;
//			
//			if(count[i] != -1)
//			{
//				for(int j = i+1; j<a.length; j++)
//				{
//					if(a[i] == a[j])
//					{
//						ct++;
//						count[j] = -1;
//					}
//				}
//				count[i] = ct;
//			}
//		}
//		return count;
//	}
}
