
//	Write a program to make the Diagonal Elements 0  &  

//	Write a program to make all Border Elements 0 

package ARRAYS.Two_DArray;

public class Make_Diagonal_Elements_0 {

	public static void main(String[] args) {
		
		int a[][] = { 	{1,2,3}, 
				   		{4,5,6}, 
				   		{7,8,9}
			     	};
		
		int b[][] = { 	{1,2,3}, 
		   				{4,5,6}, 
				   		{7,8,9}
			     	};

		System.out.println("-------------- Make Diagonal elements 0 ---------------");
		for(int i=0; i<a.length;i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				if(i==j)
				{
					a[i][j] = 0;
				}
				System.out.print(a[i][j]+" ");   // 0 2 3
			System.out.println();                // 7 8 0
		}
		System.out.println("-------------- Make Border elements 0 ---------------");
		
		for(int i=0; i<b.length;i++)
		{
			for(int j=0; j<b[i].length;j++)
			{
				if(i==0 || j==0 || i==b.length-1 || j==b[i].length-1)
				{
					b[i][j] = 0;
				}
				System.out.print(b[i][j]+" ");   // 0 0 0 
			}								     // 0 5 0
			System.out.println();                // 0 0 0
		}
	

	}

}
