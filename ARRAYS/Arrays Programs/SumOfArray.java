
//Write a Program that gives the Sum of the Array (Without Method)

package ARRAYS.Programs;

public class SumOfArray {

	public static void main(String[] args) {
		
		int ar [] = {10,20,30,40,50};
		
		int sum = 0;
		
		for(int i = 0; i<ar.length; i++)
		{
			sum += ar[i];
		}
		
		System.out.println("Sum of Array is : "+sum);
				

	}

}
