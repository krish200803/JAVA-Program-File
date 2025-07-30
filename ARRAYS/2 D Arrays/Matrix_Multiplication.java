
//	Write a Program for Matrix Multiplication and also check if both the Matrix is Symmetric or not 


package ARRAYS.Two_DArray;

import java.util.Arrays;

public class Matrix_Multiplication {

	public static void main(String[] args) {
		
		int a[][] = { 	{1},
						{2}, 
				   		{3}	
				   		
			     	};
		
		int b[][] = { 	{1,4,7}, 

			     	};
		
		int ans[][] = multiplication(a, b);
		
		System.out.println("The Multiplication of Matrix is :");
		
		try                              
		{
			for(int i=0; i<ans.length;i++)
			{
				System.out.println(Arrays.toString(ans[i]));
			}
		} 
		catch (NullPointerException e) {
			System.out.println("Size of a Matrix is Not Symmetrical");
		}

	}
	
	public static int[][] multiplication( int a[][], int b[][])
	{
		if(checkSymmetrical(a, b) && a[0].length==b.length)
		{
			int c[][] = new int [a.length][b[0].length];
			
			for(int i=0; i<a.length;i++)
			{
				for(int j=0 ;j<b[0].length;j++)
				{
					for(int k=0; k<b.length;k++)
					{
						c[i][j] += a[i][k] * b[k][j];
					}
				}
			}
			return c;
		}
		return null;
	}
	
	public static boolean checkSymmetrical(int [][]a, int [][]b)    // [1,3],
	{															    // [1]      => this array is not symmetric
		boolean check1 = true, check2 = true;						// [5,6,7]
		
		for(int i=0;i<a.length;i++)
		{
			if(a[0].length != a[i].length)
			{
				check1 = false;
				break;
			}
		}
		
		for(int i=0;i<b.length;i++)
		{
			if(b[0].length != b[i].length)
			{
				check2 = false;
				break;
			}
		}
		return check1&&check2;
	}


}
