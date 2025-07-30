
//		Write a Program to Transpose the Given Matrix

//			{'a','b','c'},               [a, d, g]
//			{'d','e','f'},   o/p  ==>    [b, e, h]
//			{'g','h','i'}                [c, f, i]

package ARRAYS.Two_DArray;

import java.util.Arrays;

public class Transpose_A_Matrix {

	public static void main(String[] args) {
		
		char a[][] = { 	{'a','b','c'}, 
				   		{'d','e','f'}, 
				   		{'g','h','i'}
			     	};
		
		int b[][] = { 	{1,2,3,4}, 
				   		{5,6,7,8}, 
				   		{9,10,11,12},
				   		{13,14,15,16}
			     	};
		
		transpose_a(a);
		System.out.println();
		
		transpose_b(b);

	}
	
	public static void transpose_a(char a[][])
	{
		for(int i=0; i<a.length;i++)
		{
			for(int j=i; j<a[i].length;j++)    // Logic 1  j=i i.e Everytime j will start from i
			{
				if(j>i)                        // Logic 1   (j > i)
				{
					char temp = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = temp;
				}
			}
		}
		System.out.println("Transpose of char a[][] Matrix is :");
		for(int i = 0; i<a.length;i++)
		{
			System.out.println(Arrays.toString(a[i]));
		}
	}
	  
	public static void transpose_b(int b[][])
	{
		for(int i=0; i<b.length;i++)
		{
			for(int j=0; j<b[i].length;j++)    // Everytime j will start from 0
			{
				if(j<i)                        // Logic 2   (j < i)
				{
					int temp = b[i][j];
					b[i][j] = b[j][i];
					b[j][i] = temp;
				}
			}
		}
		System.out.println("Transpose of int b[][] Matrix is :");
		for(int i = 0; i<b.length;i++)
		{
			System.out.println(Arrays.toString(b[i]));
		}
	}

}
