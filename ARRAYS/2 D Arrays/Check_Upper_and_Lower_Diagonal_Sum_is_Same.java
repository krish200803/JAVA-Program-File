
//	Check if the Upper Diagonal Sum and Lower Diagonal Sum is Same or Not

package ARRAYS.Two_DArray;

public class Check_Upper_and_Lower_Diagonal_Sum_is_Same {

	public static void main(String[] args) {
		
		int ar[][] = { 	{1,2,3}, 
				   		{4,5,6}, 
				   		{7,8,9}
			     	};
		
		int upperSum = 0;
		int lowerSum = 0;
		
		for(int i = 0; i<ar.length; i++)
		{
			for(int j = 0; j<ar[i].length;j++)
			{
				if(i<j)
				{
					upperSum += ar[i][j];
				}
				else if(i>j)
				{
					lowerSum += ar[i][j];
				}
			}
		}
		
		System.out.println("Upper Diagonal Sum :"+ upperSum);
		System.out.println("Lower Diagonal Sum :"+ lowerSum);
		
		System.out.println(checkSum(upperSum, lowerSum));
		
	}
	
	public static boolean checkSum(int upperSum, int lowerSum)
	{
		if(upperSum == lowerSum)
		{
//			System.out.println("Sum is Equal");
			return true;
		}
		else
		{
//			System.out.println("Sum is not Equal");
			return false;
		}
	}

}
