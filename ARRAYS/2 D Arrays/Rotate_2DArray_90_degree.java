package ARRAYS.Two_DArray;

import java.util.Arrays;

public class Rotate_2DArray_90_degree {

	public static void main(String[] args) {
		
		int ar[][] = { 	{1,2,3}, 
				   		{4,5,6}, 
				   		{7,8,9}
			     	};
		
		for(int i = 0; i<ar.length;i++)
		{
			System.out.println(Arrays.toString(ar[i]));
		}
		System.out.println();
		
		System.out.println("-----------------------------------------");
		
		transpose_ar(ar);             // Array ar[][] gets Transpose
		
		System.out.println();
		swap(ar);                      // Array ar[][] gets swap/ rotate 90 degree


	}
	
//	If we only execute swap() method output array will be i.e reverse of array ar[][]
//	
//						[1, 2, 3]				    [3, 2, 1]
//						[4, 5, 6]	==> o/p			[6, 5, 4]
//						[7, 8, 9]				    [9, 8, 7]
	
	public static void swap(int ar[][])   // Here the Transposed array goes as a parameter
	{
		for(int i=0; i<ar.length;i++)
		{ 
			int j=0, k=ar[i].length-1;
			
			while(j<k)
			{
				int temp = ar[i][j];
				ar[i][j] = ar[i][k];
				ar[i][k] = temp;
				j++;
				k--;
			}
		}
		
		System.out.println("Rotated 90 degree Matrix is : ");
		for(int i = 0; i<ar.length;i++)
		{
			System.out.println(Arrays.toString(ar[i]));
		}
	}
	
	public static void transpose_ar(int ar[][])     // Methos for making Array ar[][] transpose
	{
		for(int i=0; i<ar.length;i++)
		{
			for(int j=0; j<ar[i].length;j++)    // Everytime j will start from 0
			{
				if(j<i)                        // Logic 2   (j < i)
				{
					int temp = ar[i][j];
					ar[i][j] = ar[j][i];
					ar[j][i] = temp;
				}
			}
		}
		System.out.println("Transpose of int ar[][] Matrix is :");
		for(int i = 0; i<ar.length;i++)
		{
			System.out.println(Arrays.toString(ar[i]));
		}
	}
	
	

	
	
	
	

}
