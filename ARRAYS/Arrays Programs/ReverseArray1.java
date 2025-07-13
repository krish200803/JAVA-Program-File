
// Write  aprogram to reverse the array into the new Array by 

package ARRAYS.Programs;                                // LOGIC 2

import java.util.Arrays;                              //    [ 2 POINTER APPROACH ] Program

public class ReverseArray1 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		
		System.out.println(Arrays.toString(reverseArray(a)));

	}
	
// 		In this 2 pointer approach i, j of ar[] in one loop iteration storing the values into
//	    i,j of rev[] simultaneosly reducing time Complexity i.e n/2 .
	
	public static int[] reverseArray(int a[])
	{
		int rev[] = new int[a.length];
		
		for(int i = 0, j = a.length-1;i <= j ;i++, j-- )
		{
			rev[i] = a[j];
			rev[j] = a[i];
		}
		return rev;
	}

}
