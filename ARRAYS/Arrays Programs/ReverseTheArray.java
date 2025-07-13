
//	Write a Program to Reverse the Given Array without Creating the Duplicate Array 

package ARRAYS.Programs;                   

import java.util.Arrays;                                      // [ LOGIC 4 ]

public class ReverseTheArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		
		System.out.println(Arrays.toString(reverseArray(a)));

	}
	
//	In this Program we are using  "  Extra Variable temp  "
	
	public static int[] reverseArray(int a [])
	{
		for(int i=0, j=a.length-1; i<j;i++,j--)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		return a;
	}

}
