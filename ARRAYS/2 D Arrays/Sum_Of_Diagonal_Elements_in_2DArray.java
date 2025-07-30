
//	Write a program to Print the sum of Diagonal Elements in Array

package ARRAYS.Two_DArray;

public class Sum_Of_Diagonal_Elements_in_2DArray {

	public static void main(String[] args) {
		
		int ar[][] = { {1,2,3}, 
					   {4,5,6}, 
					   {7,8,9}
				     };

		int sum = 0;
		for(int i=0; i<ar.length;i++)
		{
			for(int j=0; j<ar[i].length;j++)
			{
				if(i==j )
				{
					sum += ar[i][j];
				}
			}
		}
		System.out.println("Sum of Diagonal Elements is :"+sum); // 15

	}

}
