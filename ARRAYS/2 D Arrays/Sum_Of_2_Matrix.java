
//	Write a program for doing Sum of 2 matrix by checking their length of both and store it in third matrix array

//					[2,   4,  6]
//					[8,  10, 12]   // output
//					[14, 16, 18]		 

package ARRAYS.Two_DArray;

import java.util.Arrays;

public class Sum_Of_2_Matrix {

	public static void main(String[] args) {
		
		int a[][] = { 	{1,2,3}, 
				   		{4,5,6}, 
				   		{7,8,9}
			     	};
		
		int b[][] = { 	{1,2,3}, 
		   				{4,5,6}, 
				   		{7,8,9}
			     	};
		
		if(a.length == b.length)
		{
			int i;
			for(i=0;i<a.length;i++)
			{
				if(a[i].length != b[i].length)
				{
					System.out.println("Matrix are different in size !!!");
					break;
				}
			}
			
			if(i == a.length)
			{
				int c[][] = new int[a.length][a[0].length];
				for(int j = 0; j<a.length;j++)
				{
					for(int j2 = 0; j2<a[j].length;j2++ )
					{
						c[j][j2] = a[j][j2] + b[j][j2];
					}
				}
				
				System.out.println("Addition of Matrix a[][] & Matrix b[][] is :");
				for(int j=0; j<c.length;j++)
				{
					System.out.println(Arrays.toString(c[j]));
				}
			}
		}

	}

}
