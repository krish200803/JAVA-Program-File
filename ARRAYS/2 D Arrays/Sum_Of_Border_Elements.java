
//	Write a program to print the sum of all Border elements

package ARRAYS.Two_DArray;

public class Sum_Of_Border_Elements {

	public static void main(String[] args) {
		
		
		int ar[][] = { 	{1,2,3}, 
				   		{4,5,6}, 
				   		{7,8,9}
			     	};

		int sum = 0;
		for(int i=0; i<ar.length;i++)
		{
			for(int j=0; j<ar[i].length;j++)
			{
				if( i==0 || j==0 || i==ar.length-1 || j==ar[i].length-1 )
				{
					sum += ar[i][j];
				}  
			}								                          
		}
		System.out.println("Sum of all Border elements is : "+sum);   // 40

	}

}
