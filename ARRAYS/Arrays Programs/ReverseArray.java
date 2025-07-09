
//Reverse Copy the given Array without using Extra Variable in loop i.e BY USING TWO POINTER APPROCH

package ARRAYS.Programs;

import java.util.Arrays;

public class ReverseArray {
	
	public static int[] reverseCopy(int ar[])
	{
		int rev [] = new int[ar.length];
		
		for(int i = 0; i<ar.length; i++)
		{
			rev[rev.length-1-i]= ar[i];
		}
		return rev;
	}
	
	public static void main(String[] args) {
		
		int ar[] = {10,20,30,40,50};
		
		int ans[] = reverseCopy(ar);
		
		System.out.println("Original Array is :"+ Arrays.toString(ar));
		
		System.out.println("Reverse Array is : "+ Arrays.toString(ans));
		
//		for(int i = 0; i<ans.length; i++)
//		{
//			System.out.println(ans[i]);
//		}
		
		
		
	}
	

}
