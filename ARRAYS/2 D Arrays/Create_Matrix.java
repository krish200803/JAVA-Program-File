package ARRAYS.Two_DArray;

import java.util.Scanner;

public class Create_Matrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ar[][] = new int[3][3];
		
		System.out.println("Enter the Elements in Array : ");
		for(int i = 0; i<ar.length; i++)
		{
			for(int j = 0; j<ar[i].length; j++)
			{
				ar[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elements Are : ");
		
		for(int i = 0; i<ar.length; i++)
		{
			for(int j=0; j<ar[i].length; j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

}
