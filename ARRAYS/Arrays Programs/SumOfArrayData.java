
//Design a Method which accepts an Int Array and Returns the Sum of it

package ARRAYS.Programs;

public class SumOfArrayData {
	
	public static int sumOfArray(int ar[])
	{	
		int sum = 0;
		for(int i = 0; i<ar.length;i++)
		{
			sum = sum + ar[i];
		}
		return sum;
		
	}

	public static void main(String[] args) {
		
		int ar[] = {10,20,30,40,50};
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+ " ");
		}
		System.out.println();
		
		System.out.println("Sum of Array Data is : "+ sumOfArray(ar));
	
	}

}
