
// Write A program to Convert all Negative Elements of an Array to Positive Elements

package ARRAYS.Programs;

import java.util.Arrays;

public class NegativeToPositiveArray {

	public static void main(String[] args) {
		
		int a [] = {2,5,-2,-1,-4,6,-10};
		
		System.out.println(Arrays.toString(negToPos(a)));

	}
	
	public static int[] negToPos(int a[]) 
	{
//		int ans[] = new int[a.length];
		
		for(int i =0; i<a.length; i++) {
			
			if(a[i] < 0)
			{
				a[i] = a[i] * (-1);
			}
			else
				a[i] = a[i];
		}
		return a;
	}

}
