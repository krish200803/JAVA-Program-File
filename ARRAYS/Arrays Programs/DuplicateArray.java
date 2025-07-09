package ARRAYS.Programs;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		
		int ar[] = {10,20,30,40,50};
		int dup[] = new int[ar.length];
		
		for(int i=0; i<ar.length; i++)
		{
			dup[i] = ar[i];
		}
		
		for(int i=0 ; i<ar.length; i++)
		{
			System.out.print(ar[i]+ " ");     // Original Array  [ 10,20,30,40,50 ]
		}
		System.out.println();
		
		for(int i=0; i<dup.length; i++)
		{
			System.out.print(dup[i] +" ");    // Duplicate Array [ 10,20,30,40,50 ]
		}
		
		System.out.println();
		
		// Here we have used the toString() Method which is internally Overrided by an ARRAYS
		// So we invoke a toString() Method using Arrays class 
 		
		System.out.print(Arrays.toString(ar));  
		
		System.out.println();
		
		System.out.println(Arrays.toString(dup));
		
		
		
		
	}

}
