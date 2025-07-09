
//Sum of Even and Odd element in an Array & chech if Both the Sum Are equal

package ARRAYS.Programs;

public class EvenOddAddition {
	
	public static boolean evenOddAdd(int ar[])
	{
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i] % 2 == 0)
			{
				evenSum += ar[i]; 
			}
			else
			{
				oddSum += ar[i];
			}
		} 
		
		System.out.println("Even Sum : "+ evenSum);
		System.out.println("Odd Sum : "+ oddSum);
		
		return evenSum == oddSum;		
		
//		if(evenSum == oddSum)
//		{
//			System.out.println("Sum are equal");
//		}
//		else {
//			System.out.println("Sum are not Equal");
//		}
		
	}

	public static void main(String[] args) {
		
		int ar[] = {1,2,3,4,5};
		
		System.out.println(evenOddAdd(ar));
	}
}
