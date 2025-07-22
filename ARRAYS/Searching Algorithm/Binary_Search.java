
//	Write a Program to Search the Element in the Array Using Binary Search Algorithm

package ARRAYS.Seraching_Algorithm;

import java.util.Arrays;

public class Binary_Search {

	public static void main(String[] args) {
		
		int a[] = {100,20,3,2,1,63,6,89,0,-32,-9,1,-8};  // -> o/p [-32, -9, -8, 0, 1, 1, 2, 3, 6, 20, 63, 89, 100]
		
		binarySearch(a, 100);     // o/p ->  Element is Found at 9 Index

	}
	
	public static void binarySearch(int a[], int search)
	{
		bubbleSort(a);
		System.out.println("Sorted Array is : "+Arrays.toString(a));
		// To Search the Element first we have Sorted the Given Array
		
		int start = 0, end = a.length-1, mid = (start + end)/2;
		
		while(start <= end)
		{
			if(a[mid] == search)
			{
				System.out.println("Element is Found at "+ mid +" Index");
				break;
			}
			else if(search > a[mid])
			{
				start = mid+1;
			}
			else if(search < a[mid])
			{
				end = mid-1;
			}
			mid = (start + end)/2;
		}
		
		
	}
	
	public static void bubbleSort(int a[])
	{
		for(int i = 0; i<a.length-1; i++)
		{
			for(int j = 0; j<a.length-1-i; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}

}
