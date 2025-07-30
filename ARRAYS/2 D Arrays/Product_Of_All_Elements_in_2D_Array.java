package ARRAYS.Two_DArray;

//import java.util.Scanner;

public class Product_Of_All_Elements_in_2D_Array {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		
//		int ar[][] = new int[3][3];
		
		int ar[][] = { {1,2,3}, 
					   {4,5,6}, 
					   {7,8,9}
				     };
		
//		
//		System.out.println("Enter the Elements : ");
//		for(int i = 0; i<ar.length;i++)
//		{
//			for(int j=0; j<ar[i].length; j++)
//			{
//				ar[i][j] = sc.nextInt();
//			}
//		}
		
		int pro = 1;
		for(int i=0; i<ar.length; i++)
		{
			for(int j = 0; j<ar[i].length;j++)
			{
				pro = pro * ar[i][j];
			}
		}
		System.out.println("Sum of all Elements in Array is : "+pro); //  362880

	}

}
