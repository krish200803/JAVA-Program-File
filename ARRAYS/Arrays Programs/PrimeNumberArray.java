
// Find the Count of Prime Numbers In an Array

package ARRAYS.Programs;

public class PrimeNumberArray {
	
	public static int countOfPrime(int ar[])
	{
		int cnt = 0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(isPrime(ar[i]))
			{
				cnt++;
			}
		}
		return cnt;
	}
	
	public static boolean isPrime(int num)
	{
		int den = 2;
		
		while(den < num)
		{
			if(num % den == 0)
			{
				return false;
			}
			
			den++;
		}
		return num == den;
		
		
	}

	public static void main(String[] args) {
		
		int ar[] = { 12,45,56,67,23,12,3,4,7};
		
		System.out.println("The Count of Prime Number in an Array is : "+countOfPrime(ar));

	}

}
