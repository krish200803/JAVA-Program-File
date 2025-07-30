
// Write A Program to print the sum of all the Elements in 2D array

package ARRAYS.Two_DArray;

import java.util.Scanner;

public class Sum_Of_All_Elements_in_2D_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ar[][] = new int[3][3];
		
		System.out.println("Enter the Elements : ");
		for(int i = 0; i<ar.length;i++)
		{
			for(int j=0; j<ar[i].length; j++)
			{
				ar[i][j] = sc.nextInt();
			}
		}
		
		int sum = 0;
		for(int i=0; i<ar.length; i++)
		{
			for(int j = 0; j<ar[i].length;j++)
			{
				sum = sum + ar[i][j];
			}
		}
		System.out.println("Sum of all Elements in Array is : "+sum);

	}

}
