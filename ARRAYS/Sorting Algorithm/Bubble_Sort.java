
//	Write a Program to Sort the Array using Bubble Sort Algorithm

//					Time Complexity of Bubble Sort = O( n^2 )


package ARRAYS.Sortnig_Algorithm;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
		
		int a[] = {100,20,3,2,1,63,6,89,0,-32,-9,1,-8}; // -> o/p [-32, -9, -8, 0, 1, 1, 2, 3, 6, 20, 63, 89, 100]
		
		bubbleSort(a);
		
		System.out.println(Arrays.toString(a));
		

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
		return;
	}

}
